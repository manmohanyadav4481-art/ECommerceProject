package com.amazon.kodwala6.order_jdbc_with_txn1;

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
	
 try {
	Statement stmt =	connection.createStatement();
	
	  connection.setAutoCommit(false);  // set the auto commit false
	 
	 // create order record with status created
	 // confirm the payment
	 // update the orders tables with paid
	 
	 String createOrderSql = "INSERT INTO ORDERS(id, item, status ) VALUES(1, 'IPHONE18', 'CREATED') ";
	 
	 int records = stmt.executeUpdate(createOrderSql);  // 1st
	 if(records>0)
	 {
		System.out.println("order create record "); 
	 }
	 else
	 {
		 System.err.println("unable to record created");
	 }
	 
	 String createPaymentSql = "INSERT INTO payment(id, refid, status ) VALUES(1, 'PR1234', 'INIT') ";
	 
	
	  records = stmt.executeUpdate(createPaymentSql);  // 2nd 
	 if(records>0)
		 
	 {
		System.out.println("Payment create record "); 
	 }
	 else
	 {
		 System.err.println("unable to record payment created");
	 }
	 
	 //user did not have enough balance
	 
	 String updatePayment = "update payment set status = 'failed' where id=1";
	/* 
	 String name =null;
	 name.length();
	 */
	 records = stmt.executeUpdate(updatePayment);  // 3nd
	if(records>0)
		 
	{
		System.out.println("Payment record updated "); 
	}
	else
	{
		 System.err.println("unable to updated payment created");
	}
	
	System.out.println("Doing commit..........");
	connection.commit();
	
} catch (Exception e) {
	
	System.out.println("Exception - Doing roll back .....");
	connection.rollback();
}

//



	}
}