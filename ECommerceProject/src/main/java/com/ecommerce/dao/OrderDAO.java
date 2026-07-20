package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ecommerce.util.DBConnection;

public class OrderDAO {

	public boolean placeOrder(int customerId) {

	    Connection con = null;

	    try {

	        con = DBConnection.getConnection();

	        if (con == null) {
	            return false;
	        }

	        con.setAutoCommit(false);

	        // Calculate Total Amount
	        double totalAmount = 0;

	        String totalSql = """
	                SELECT SUM(p.price * c.quantity) AS total
	                FROM cart c
	                JOIN products p
	                ON c.product_id = p.product_id
	                WHERE c.customer_id = ?
	                """;

	        PreparedStatement psTotal = con.prepareStatement(totalSql);
	        psTotal.setInt(1, customerId);

	        ResultSet rsTotal = psTotal.executeQuery();

	        if (rsTotal.next()) {
	            totalAmount = rsTotal.getDouble("total");
	        }

	        if (totalAmount == 0) {
	            System.out.println("Cart is empty.");
	            con.rollback();
	            return false;
	        }

	        // Create Order
	        String orderSql =
	                "INSERT INTO orders(customer_id, total_amount, status) VALUES(?,?,?)";

	        PreparedStatement psOrder =
	                con.prepareStatement(orderSql, Statement.RETURN_GENERATED_KEYS);

	        psOrder.setInt(1, customerId);
	        psOrder.setDouble(2, totalAmount);
	        psOrder.setString(3, "PLACED");

	        int rows = psOrder.executeUpdate();

	        if (rows == 0) {
	            con.rollback();
	            return false;
	        }

	        
	        
	        ResultSet rs = psOrder.getGeneratedKeys();

	        int orderId = 0;

	        if (rs.next()) {
	            orderId = rs.getInt(1);
	        }
	        
	        if (!saveOrderItems(con, orderId, customerId)) {
	            con.rollback();
	            return false;
	        }
	        
	        if (!clearCart(con, customerId)) {
	            con.rollback();
	            return false;
	        }
	        
	        System.out.println("Order Created Successfully");
	        System.out.println("Order ID : " + orderId);
	        System.out.println("Total Amount : " + totalAmount);

	        con.commit();

	        return true;

	    } catch (Exception e) {

	        e.printStackTrace();

	        try {
	            if (con != null) {
	                con.rollback();
	            }
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	        return false;

	    } finally {

	        try {
	            if (con != null) {
	                con.setAutoCommit(true);
	                con.close();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	private boolean updateStock(Connection con, int productId, int quantity) {

	    String sql = "UPDATE products SET stock = stock - ? WHERE product_id = ?";

	    try (PreparedStatement ps = con.prepareStatement(sql)) {

	        ps.setInt(1, quantity);
	        ps.setInt(2, productId);

	        int rows = ps.executeUpdate();

	        return rows > 0;

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return false;
	}
    private boolean saveOrderItems(Connection con, int orderId, int customerId) {

        String cartSql = """
                SELECT c.product_id,
                       c.quantity,
                       p.price
                FROM cart c
                JOIN products p
                ON c.product_id = p.product_id
                WHERE c.customer_id = ?
                """;

        String insertSql = """
                INSERT INTO order_items(order_id, product_id, quantity, price)
                VALUES(?,?,?,?)
                """;

        try {

            PreparedStatement psCart = con.prepareStatement(cartSql);
            psCart.setInt(1, customerId);

            ResultSet rs = psCart.executeQuery();

            PreparedStatement psInsert = con.prepareStatement(insertSql);
          
            while (rs.next()) {

                int productId = rs.getInt("product_id");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");

                psInsert.setInt(1, orderId);
                psInsert.setInt(2, productId);
                psInsert.setInt(3, quantity);
                psInsert.setDouble(4, price);

                psInsert.addBatch();

                // Update stock
                if (!updateStock(con, productId, quantity)) {
                    return false;
                }
            }

            psInsert.executeBatch();
            
            
            while (rs.next()) {

                psInsert.setInt(1, orderId);
                psInsert.setInt(2, rs.getInt("product_id"));
                psInsert.setInt(3, rs.getInt("quantity"));
                psInsert.setDouble(4, rs.getDouble("price"));

                psInsert.addBatch();
            }

            psInsert.executeBatch();

            return true;
            
            
            

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    private boolean clearCart(Connection con, int customerId) {

        String sql = "DELETE FROM cart WHERE customer_id=?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);

            int rows = ps.executeUpdate();

            System.out.println("Cart Rows Deleted : " + rows);

            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    public void viewOrders(int customerId) {

        String sql = """
                SELECT order_id,
                       total_amount,
                       order_date,
                       status
                FROM orders
                WHERE customer_id = ?
                ORDER BY order_date DESC
                """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);

            ResultSet rs = ps.executeQuery();

            System.out.println("\n===== ORDER HISTORY =====");

            while (rs.next()) {

                System.out.println(
                        "Order ID : " + rs.getInt("order_id")
                        + " | Amount : ₹" + rs.getDouble("total_amount")
                        + " | Date : " + rs.getTimestamp("order_date")
                        + " | Status : " + rs.getString("status"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
        
        public int getLastOrderId() {

            String sql = "SELECT MAX(order_id) AS order_id FROM orders";

            try (Connection con = DBConnection.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return rs.getInt("order_id");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return -1;
        }
        
    }
