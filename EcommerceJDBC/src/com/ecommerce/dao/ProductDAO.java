package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.jupiter.api.Test;

import com.ecommerce.connection.DBConnection;

public class ProductDAO 
{
   @Test
	public void viewProducts() {
		
		try {
			
			Connection con = DBConnection.getConnection();
			
			String sql = "SELECT *FROM products";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			System.out.println("-------------------------------------------------------------------");
			
			System.out.println("ID\tName\t\tPrice\tStock");
			
			System.out.println("-------------------------------------------------------------------");
			
			while (rs.next()) {
				
				System.out.println(rs.getInt("product_id")+"\t"+rs.getString("product_name")+"\t\t"+rs.getDouble("price")+"\t"+rs.getInt("stock"));
				
	        }
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
