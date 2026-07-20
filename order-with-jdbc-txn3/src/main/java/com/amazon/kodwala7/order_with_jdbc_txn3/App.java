package com.amazon.kodwala7.order_with_jdbc_txn3;

import java.sql.SQLException;

import com.amazon.kodwala7.order_with_jdbc_txn4.OrderMgmt;
import com.amazon.kodwala7.order_with_jdbc_txn4.OrderMgmtPreparedstmt;


public class App 
{
    public static void main( String[] args )
    {
        OrderMgmt mgmt = new OrderMgmt();
        
        try {
        	
        	// mgmt.placeOrder();
        	
        	OrderMgmtPreparedstmt orderMgmtPreparedStmt = new OrderMgmtPreparedstmt();
        	
        	//orderMgmtPreparedStmt.updatePayment("BLOCKED", 1);
        	
        	orderMgmtPreparedStmt.insertRecords();
        	
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
        
       
    }
}

// batch size find