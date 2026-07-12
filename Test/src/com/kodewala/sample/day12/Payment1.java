package com.kodewala.sample.day12;

public class Payment1 {

	public static void main(String[] args) {
		System.out.println("Payment.main()............");

		String name = args[0];
		String add = args[1];
		
		System.out.println("Name "+name +" add :"+add);
		
		Payment1 pa = new Payment1 ();
		pa.doPayment1();
		
	}
  public void doPayment1 ()
  {
System.out.println("Payment.doPayment().................STARTED");

PaymentProcessor1 pay = new PaymentProcessor1 ();

pay.processPayment();

System.out.println("Payment.doPayment().............ENDED");

}
}

class PaymentProcessor1 {
	public void processPayment () {
		System.out.println("PaymentProcessor.processPayment()....STARTED");
		
		System.out.println("PaymentProcessor.processPayment()....ENDED");
	}
}