package com.amazon.kodwala7.order_with_jdbc_txn5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderMgmtPreparedstmt 
{

	public void updatePayment (String status, int id) throws ClassNotFoundException , SQLException
	
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); // dynamic class loading
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root", "12345");
		
		String updatQuery = "update payment set status=? where id=?";
    
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
	
	public void insertRecords () throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); // dynamic class loading
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root", "12345");
	
		String insertQuery = "insert into payment (id,refid, status) values(?,?,?)";
		
		PreparedStatement ps = connection.prepareStatement(insertQuery);
		
		
		connection.setAutoCommit(false);
		
		int batchSize = 10;
		for (int i = 10;  i < 100; i++) {
			 ps.setInt(1, i);
			 ps.setString(2, "REFID"+i);
			 ps.setString(3, "INT");
			 ps.addBatch();
			 
			 if(i % batchSize == 0)
			 {
					System.out.println("Excuted Query...");
					ps.executeBatch(); // only one db hit
					ps.clearBatch();
			 }
			 
		}
	    ps.executeBatch();
		connection.commit();
	  
	   
	
	}
	
}