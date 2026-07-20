package com.ecommerce.dao;

import java.sql.Statement;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ecommerce.connection.DBConnection;

public class OrderDAO 
{
	@Test
public void placeOrder(int customerId) {
	
	Connection con =null;
	
	try {
		
		con = DBConnection.getConnection();
		
		con.setAutoCommit(false);
		
		System.out.println("Order placement started...");

			double totalAmount = 0;
			
			String totalSql = "SELECT SUM(p.price * c.quantity) AS total "+" FROM cart c JOIN products p "+" ON c.product_id = p.product_id "+" WHERE c.customer_id = ?";
		
			PreparedStatement psTotal = con.prepareStatement(totalSql);
			psTotal.setInt(1, customerId);
			
			ResultSet rsTotal = psTotal.executeQuery();
			
			if (rsTotal.next()) {
			    totalAmount = rsTotal.getDouble("total");
			    if (rsTotal.wasNull()) {
			        totalAmount = 0;
			    }
			
			}
			
			if(totalAmount == 0) {
				System.out.println("Cart is empty , Cannot place order .");
				return;
			}
			
			String orderSql = "INSERT INTO orders(customer_id, total_amount) VALUES(?,?)";
			
			PreparedStatement psOrder = con.prepareStatement(orderSql, Statement.RETURN_GENERATED_KEYS);
			
			psOrder.setInt(1, customerId);
	        psOrder.setDouble(2, totalAmount);
	        
	        psOrder.executeUpdate();
	        
	        ResultSet rsOrder = psOrder.getGeneratedKeys();
	        
	        int orderId = 0;
	        
	        if (rsOrder.next()) {
	        	orderId = rsOrder.getInt(1);
	        }
	        System.out.println("Order Id : "+orderId);
	       
	        saveOrderItems (con, customerId, orderId);
	        updateStock(con, customerId);
	        clearCart(con, customerId);
	        
	        rsTotal.close();
	        psTotal.close();
	        rsOrder.close();
	        psOrder.close();
	        
	        con.commit();
	        
	        System.out.println("Order placed successfully.");
	        
	}catch (Exception e) {
		e.printStackTrace();
		
		try {
			if (con !=null) {
				con.rollback();
				System.out.println("Transaction rolled back");
			}
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
	
	}finally {
		
		try {
			if (con != null) {
				con.setAutoCommit(true);
				con.close();
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}        
	@Test
		private void saveOrderItems(Connection con, int customerId, int orderId) {
			
			try {
				
				String selectCart =
						"SELECT c.product_id, c.quantity, p.price " +
						"FROM cart c JOIN products p " +
						"ON c.product_id = p.product_id " +
						"WHERE c.customer_id = ?";
				PreparedStatement psSelect = con.prepareStatement(selectCart);
				
				psSelect.setInt(1, customerId);
				
				ResultSet rs =psSelect.executeQuery();
				
				String insertitem = "INSERT INTO order_items(order_id, product_id, quantity, price) VALUES(?,?,?,?)";
				
				PreparedStatement psInsert = con.prepareStatement(insertitem);
				
				while (rs.next()) {
				
					psInsert.setInt(1, orderId);
					psInsert.setInt(2, rs.getInt("product_id"));
					psInsert.setInt(3, rs.getInt("quantity"));
					psInsert.setDouble(4, rs.getDouble("price"));
					
					psInsert.addBatch();
					
				}
				
				psInsert.executeBatch();
				
				rs.close();
				psSelect.close();
				psInsert.close();
				
				System.out.println("Order items saved successfully");
				
			} catch (Exception e2) {
				
				e2.printStackTrace();
			}
		}
	@Test
private void updateStock (Connection con , int customerId) {
	
	try {
		
		
		String selectSql = "SELECT product_id, quantity FROM cart WHERE customer_id = ?";
		
		PreparedStatement psSelect = con.prepareStatement(selectSql);
		
		psSelect.setInt(1, customerId);
		
		ResultSet rs = psSelect.executeQuery();
		
		String updateSql = "UPDATE products SET stock = stock - ? WHERE product_id = ?";
		
		PreparedStatement psUpdate = con.prepareStatement(updateSql);
		
		while (rs.next()) {
			
			psUpdate.setInt(1, rs.getInt("quantity"));
			psUpdate.setInt(2, rs.getInt("product_id"));
			
			psUpdate.addBatch();
		}
		
		psUpdate.executeBatch();
		
		rs.close();
		psSelect.close();
		psUpdate.close();
		
		System.out.println("Product stock updated successfully.");
		
		
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
@Test
private void clearCart(Connection con, int customerid) {
	
	try {
		
		String sql = "DELETE FROM cart WHERE customer_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, customerid);
		
		ps.executeUpdate();
		
		System.out.println("Cart cleared successfully.");
		
	
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
@Test
public void viewOrders (int customerId) {
	
	try {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM orders WHERE customer_id=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, customerId);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
		System.out.println("Order ID : "+rs.getInt("order_id"));
		System.out.println("Customer ID : "+rs.getInt("customer_id"));
		System.out.println("Order Date : "+rs.getTimestamp("order_date"));
		System.out.println("Total Amount : "+rs.getDouble("total_amount"));
		System.out.println("--------------------------------------------------------");
			
		}
		
		con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
@Test
public void viewOrderItems(int orderId) {
	
	try {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM order_items WHERE order_id=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, orderId);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
		System.out.println("Product Id : "+rs.getInt("product_id"));
		System.out.println("Quantity : "+rs.getInt("quantity"));
		System.out.println("Price : "+rs.getDouble("price"));
		System.out.println("-----------------------------------------------------------------");
		
		}
		
		con.close();
		rs.close();
		ps.close();
	
	} catch (Exception e) {
	
		e.printStackTrace();
	}
}
}
