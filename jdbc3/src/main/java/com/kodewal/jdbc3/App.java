package com.kodewal.jdbc3;

import java.sql.SQLException;



public class App 
{
    public static void main( String[] args )
    {
        PaymentServic paymentService = new PaymentServic();
        try {
			paymentService.getAllPayments("faild");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
