package com.amazon.account.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Payment {

	//@Value("ref23234444")
	private String paymentRef;
	public void showPayment () {
		
		paymentRef = "manm";  // mute this open value 
		
		System.out.println("Payment.showPayment()......."+paymentRef);
	}
}
