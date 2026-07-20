package com.amazon.order_with_jdbc_txn;

import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
        OrderMgmt mgmt = new OrderMgmt();
        
        try {
        	
        	 mgmt.placeOrder();
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
        
       
    }
}
