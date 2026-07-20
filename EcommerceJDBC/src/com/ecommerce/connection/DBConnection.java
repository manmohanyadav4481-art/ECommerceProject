package com.ecommerce.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

public class DBConnection 
{

	private static final String URL ="jdbc:mysql://localhost:3306/ecommerce_servic";
	private static final String USER ="root";
	private static final String PASSWORD ="12345";
	@Test
	public static Connection getConnection() {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(URL,USER,PASSWORD);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}
}
