package com.amazon.account.beans;

import org.springframework.stereotype.Component;

@Component  // Payment class beans Spring managed bean.
public class Payment {

	
	public void showPayment () 
	{
		System.out.println("Payment.showPayment().....................");
	}
}
