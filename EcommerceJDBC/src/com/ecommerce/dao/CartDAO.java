package com.ecommerce.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.jupiter.api.Test;

import com.ecommerce.connection.DBConnection;

public class CartDAO 
{
    @Test
	public void addToCart(int customerId, int productId, int quantity) {
		
	
	
	try {
		
		Connection con = DBConnection.getConnection();
		
		String check = "SELECT stock FROM products WHERE product_id= ?";
		
		PreparedStatement ps1 = con.prepareStatement(check);
		ps1.setInt(1, productId);
		
		ResultSet rs = ps1.executeQuery();
		
		if(rs.next()) {
			
			int stock = rs.getInt("stock");
			if(stock >= quantity) {
				
				String sql = "INSERT INTO cart(customer_id,product_id,quantity) VALUES(?,?,?)";
				
				PreparedStatement ps2 =con.prepareStatement(sql);
				
				ps2.setInt(1, customerId);
				ps2.setInt(2, productId);
				ps2.setInt(3, quantity);
				
				ps2.executeUpdate();
				
				System.out.println("Product added to cart successfully.");
			}else {
				System.out.println("Insufficient stock");
			}
		}
		
		con.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
	
	@Test
	public void viewCart(int customerId) {
		
		try {
			
			Connection con = DBConnection.getConnection();
			
			String sql = "SELECT * FROM cart WHERE customer_id = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, customerId);
			
			ResultSet rs =ps.executeQuery();
			
			System.out.println("Cart Items");
			System.out.println("----------------------------------------------------------------");
			
			while (rs.next()) {
				
				System.out.println(rs.getInt("cart_id")+"\t"+rs.getInt("customer_id")+"\t"+rs.getInt("product_id")+"\t"+rs.getInt("quantity"));
				
			}
			
			con.close();
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}
	@Test
	public void removeFromCart(int cartId) {
		
		try {
			
			Connection con = DBConnection.getConnection();
			
			String sql = "DELETE FROM cart WHERE cart_id=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, cartId);
			
			int row =ps.executeUpdate();
			
			if(row>0) {
				System.out.println("Item removed successfully.");
			}else {
				System.out.println("Cart item not found");
			}
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
