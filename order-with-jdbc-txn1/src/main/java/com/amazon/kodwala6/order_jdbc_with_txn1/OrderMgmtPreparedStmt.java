package com.amazon.kodwala6.order_jdbc_with_txn1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderMgmtPreparedStmt 
{

	public void updatePayment (String status, int id) throws ClassNotFoundException , SQLException
	
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); // dynamic class loading
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root", "12345");
		
		String updatQuery = "update payment set status=? where id=? ";
     PreparedStatement ps =   connection.prepareStatement(updatQuery);// prepared statement is faster than statement
     
     
     ps.setString(1, status); // update payment set status = "Blucked", where id=1
     ps.setInt(2, id);
     
     int recordsUpdated = ps.executeUpdate();
     if(recordsUpdated > 0) {
    	 System.out.println(" Records updated : "+recordsUpdated);
     } else {
    	 System.err.println("Unable to update the records");
     }
     
	}
	
}
