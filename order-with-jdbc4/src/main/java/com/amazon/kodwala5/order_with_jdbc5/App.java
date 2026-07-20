package com.amazon.kodwala5.order_with_jdbc5;

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
