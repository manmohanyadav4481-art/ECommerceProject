package com.kodewala.oops.polymorphism.reel.exp.day29;

public class Drivar {

	public static void main(String[] args) {
	
		PaymentProcessor paymen =new PaymentProcessor ();
		
		PhonePay pho = new PhonePay ();
		
		paymen.processPay(pho);

	}

}
