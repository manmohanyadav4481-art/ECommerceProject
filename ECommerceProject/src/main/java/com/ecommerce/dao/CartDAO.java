package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ecommerce.util.DBConnection;

public class CartDAO {

	// Add Product to Cart
	public boolean addToCart(int customerId, int productId, int quantity) {

	    String stockSql = "SELECT stock FROM products WHERE product_id=?";
	    String insertSql = "INSERT INTO cart(customer_id,product_id,quantity) VALUES(?,?,?)";

	    try (Connection con = DBConnection.getConnection()) {

	        // Check Stock
	        PreparedStatement psStock = con.prepareStatement(stockSql);
	        psStock.setInt(1, productId);

	        ResultSet rs = psStock.executeQuery();

	        if (rs.next()) {

	            int stock = rs.getInt("stock");

	            if (stock <= 0) {
	                System.out.println("Product is Out of Stock.");
	                return false;
	            }

	            if (quantity > stock) {
	                System.out.println("Only " + stock + " item(s) available.");
	                return false;
	            }

	        } else {
	            System.out.println("Product Not Found.");
	            return false;
	        }

	        // Add to Cart
	        PreparedStatement ps = con.prepareStatement(insertSql);

	        ps.setInt(1, customerId);
	        ps.setInt(2, productId);
	        ps.setInt(3, quantity);

	        if (ps.executeUpdate() > 0) {
	            System.out.println("Product Added To Cart Successfully.");
	            return true;
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return false;
	}

	
//View Cart
public void viewCart(int customerId) {

 String sql = """
         SELECT c.cart_id,
                p.product_name,
                p.price,
                c.quantity,
                (p.price * c.quantity) AS total
         FROM cart c
         JOIN products p
         ON c.product_id = p.product_id
         WHERE c.customer_id = ?
         """;

 try (Connection con = DBConnection.getConnection();
      PreparedStatement ps = con.prepareStatement(sql)) {

     ps.setInt(1, customerId);

     ResultSet rs = ps.executeQuery();

     System.out.println("===== YOUR CART =====");

     boolean found = false;

     while (rs.next()) {

         found = true;

         System.out.println(
                 rs.getInt("cart_id") + "  "
               + rs.getString("product_name") + "  ₹"
               + rs.getDouble("price") + "  Qty:"
               + rs.getInt("quantity") + "  Total: ₹"
               + rs.getDouble("total"));
     }

     if (!found) {
         System.out.println("Cart is Empty.");
     }

 } catch (Exception e) {
     e.printStackTrace();
 }
	
}


//Remove From Cart
public boolean removeFromCart(int cartId) {

 String sql = "DELETE FROM cart WHERE cart_id = ?";

 try (Connection con = DBConnection.getConnection();
      PreparedStatement ps = con.prepareStatement(sql)) {

     ps.setInt(1, cartId);

     int rows = ps.executeUpdate();

     if (rows > 0) {
         System.out.println("Product Removed From Cart Successfully.");
         return true;
     } else {
         System.out.println("Cart Item Not Found.");
         return false;
     }

 } catch (Exception e) {
     e.printStackTrace();
 }

 return false;
}

}

