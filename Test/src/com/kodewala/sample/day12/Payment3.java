package com.kodewala.sample.day12;


public class Payment3 {

	public static void main(String[] args) {
		System.out.println("Payment.main()............");

		String name = args[0];
		String add = args[1];
		
		System.out.println("Name "+name +" add :"+add);
		
		Payment3 pa = new Payment3 ();
		pa.doPayment3(name,add);
		
	}
  public void doPayment3 (String _name, String _add)
  {
System.out.println("Payment.doPayment().................STARTED");

PaymentProcessor1 pay = new PaymentProcessor1 ();

System.out.println("Name "+_name +" add :"+_add);

pay.processPayment();

System.out.println("Payment.doPayment().............ENDED");

}
}

class PaymentProcessor2 {
	public void processPayment () {
		System.out.println("PaymentProcessor.processPayment()....STARTED");
		
		System.out.println("PaymentProcessor.processPayment()....ENDED");
	}
}
