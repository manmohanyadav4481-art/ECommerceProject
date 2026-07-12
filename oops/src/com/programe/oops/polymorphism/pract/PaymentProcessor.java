package com.programe.oops.polymorphism.pract;

class Payment {
	void pay () {
		System.out.println("Payment.Pay");
	}
}
class Upi extends Payment {
	@Override
	void pay () {
		System.out.println("Upi.Pay");
	}
}
class Gpay extends Payment {
	@Override
	void pay () {
		System.out.println("Gpay . pay");
		
		
	}
	
}

public class PaymentProcessor {
	
	public void processor (Payment pay) {
		pay.pay();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
