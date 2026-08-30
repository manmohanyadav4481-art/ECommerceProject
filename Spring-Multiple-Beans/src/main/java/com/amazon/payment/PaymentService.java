package com.amazon.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

	@Autowired
	Payment payment;
	
	public void doPayment () 
	{
		payment.pay();
	}
}
