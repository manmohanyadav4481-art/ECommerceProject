package com.kodewala.sample.day12;

public class Payment {

	public static void main(String[] args) {
		System.out.println("Payment.main()............");

		Payment pa = new Payment ();
		pa.doPayment();
		
	}
  public void doPayment ()
  {
System.out.println("Payment.doPayment().................STARTED");

PaymentProcessor pay = new PaymentProcessor ();

pay.processPayment();

System.out.println("Payment.doPayment().............ENDED");

}
}

class PaymentProcessor {
	public void processPayment () {
		System.out.println("PaymentProcessor.processPayment()....STARTED");
		
		System.out.println("PaymentProcessor.processPayment()....ENDED");
	}
}