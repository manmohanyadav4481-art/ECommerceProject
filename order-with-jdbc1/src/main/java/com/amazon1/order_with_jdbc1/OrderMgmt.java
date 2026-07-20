package com.amazon1.order_with_jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderMgmt 
{


	public void placeOrder () throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); // checked exception --> class not found ---> Class not found
	
		// creating the connection with data.
	Connection connection =	DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root", "12345");
	
	  // Create the statement
	
 Statement stmt =	connection.createStatement();

 
 // create order record with status created
 // confirm the payment
 // update the orders tables with paid
 
 String createOrderSql = "INSERT INTO ORDERS(id, item, status ) VALUES(1, 'IPHONE18', 'CREATED') ";
 
 int records = stmt.executeUpdate(createOrderSql);
 if(records>0)
 {
	System.out.println("order create record "); 
 }
 else
 {
	 System.err.println("unable to record created");
 }
 
 String createPaymentSql = "INSERT INTO payment(id, refid, status ) VALUES(1, 'PR1234', 'INIT') ";
 

  records = stmt.executeUpdate(createPaymentSql);
 if(records>0)
	 
 {
	System.out.println("Payment create record "); 
 }
 else
 {
	 System.err.println("unable to record payment created");
 }
 
	}
}