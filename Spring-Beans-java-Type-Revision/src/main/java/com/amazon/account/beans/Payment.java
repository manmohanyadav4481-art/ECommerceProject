package com.amazon.account.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Payment {

	//@Value("34344")
	private String paymentRef;
	public void showPayment () {
		
		paymentRef ="2334";
		
		System.out.println("Payment.showPayment().........."+paymentRef);
	}
	
}
