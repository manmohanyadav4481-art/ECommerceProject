package com.programe.oops.polymorphism.pract;

public class DriverPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor processor = new PaymentProcessor ();
		
		Payment payment = new Payment ();
		
		processor.processor(payment);
		
		Upi upi = new Upi ();
		
		processor.processor(upi);
		
		Gpay gpay = new Gpay ();
		
		processor.processor(gpay);
	}

}
