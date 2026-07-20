package com.kodewal.jdbc4;

import java.sql.SQLException;



public class App 
{
    public static void main( String[] args )
    {
        PaymentService paymentService = new PaymentService();
        try {
			//paymentService.getAllPayments("faild");
		
        	paymentService.updatePaymentStatus(10022, "on-hold");
        	
        	paymentService.updatePaymentStatus(10023, "on-hold");
        	
        } catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
