package com.amazon.kodwala6.order_jdbc_with_txn;

import java.sql.SQLException;

import com.amazon.kodwala6.order_jdbc_with_txn1.OrderMgmt;
import com.amazon.kodwala6.order_jdbc_with_txn1.OrderMgmtPreparedStmt;





public class App 
{
    public static void main( String[] args )
    {
        OrderMgmt mgmt = new OrderMgmt();
        
        try {
        	
        	// mgmt.placeOrder();
        	
        	OrderMgmtPreparedStmt orderMgmtPreparedStmt = new OrderMgmtPreparedStmt();
        	
        	orderMgmtPreparedStmt.updatePayment("BLOCKED", 1);
        	
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
        
       
    }
}
