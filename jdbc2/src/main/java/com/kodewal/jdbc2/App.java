package com.kodewal.jdbc2;

import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
        PaymentServic paymentService = new PaymentServic();
        try {
			paymentService.getAllPayments("Paid");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
