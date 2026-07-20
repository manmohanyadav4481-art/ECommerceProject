package com.kodewal.jdbc2;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PaymentServic 
{

	public void getAllPayments (String _status) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); // checked exception --> class not found
	
		// creating the connection with data.
	Connection connection =	DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root", "12345");
	
	  // Create the statement
	
 Statement stmt =	connection.createStatement();

 String query = null;
 if (_status == null)
 {
	 
 
  query = "select * from payment";

	}
 else
 {
	 query = "select * from payment where status ='"+_status+"'";
 }
 
 // execute query 
ResultSet rs = stmt.executeQuery(query);
 
while (rs.next())
{
	int id =rs.getInt(1);
	String refid = rs.getString(2);
	String status = rs.getString(3);
	
	System.out.println("Id     : "+id);
	System.out.println("Ref Id   : "+refid);
	System.out.println("Status   : "+status);
	System.out.println("------------------------");
	
}
	}
}

