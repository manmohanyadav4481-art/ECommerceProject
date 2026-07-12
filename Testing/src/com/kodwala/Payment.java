package com.kodwala;

public class Payment {

	public static void main (String [] args) {
		System.out.println("Payment.main().......");
		
		String name = args[0];
		String add = args[1];
		
		System.out.println(" Name :" + name + "add : "+add);
		
		Payment payment = new Payment();
		payment.doPayment(name,add);		
	}
public void doPayment(String _name, String _add){
{
	System.out.println("Payment..doPayment..STARTED");

	PaymentDone paymentDone = new PaymentDone();
	
	System.out.println("Name :" + _name +" add : "+ _add);
	
	paymentDone.processPayment();
	
	System.out.println("Payment.doPayment...ENDED");
}
}

class PaymentDone {
	public void processPayment() {
		System.out.println("PaymentProcessor.Processordone() STARTED");
		System.out.println("PaymentProcessor.Processordone() ENDED");
	}
}
}