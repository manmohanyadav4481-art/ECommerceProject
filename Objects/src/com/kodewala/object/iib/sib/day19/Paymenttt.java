package com.kodewala.object.iib.sib.day19;

public class Paymenttt {
	
	 {
		System.out.println("inside SIB ");
	}
	
	public Paymenttt () {
		// 1 line - super () or this () 
		// 2nd call to init block
		System.out.println(" inside payment () constructor ");
	}

	public static void main(String[] args) {
	
		System.out.println("Payment.main()");
	}
	
	static {
		System.out.println("inside sib...only once .....");
	}
	

}
