package com.kodewal.jdbc1;

import java.sql.SQLException;



public class App 
{
    public static void main( String[] args )
    {
        PaymentService paymentService = new PaymentService();
        try {
			paymentService.getAllPayments(null);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
