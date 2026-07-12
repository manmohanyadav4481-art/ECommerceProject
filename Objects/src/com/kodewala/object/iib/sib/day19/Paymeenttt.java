package com.kodewala.object.iib.sib.day19;


public class Paymeenttt {
	
	 {
		System.out.println("inside SIB ");
	}
	
	public Paymeenttt () {
		// 1 line - super () or this () 
		// 2nd call to init block
		System.out.println(" inside payment () constructor ");
	}

	public Paymeenttt (int _amt) {
		System.out.println("Paymeenttt.Paymeenttt()");
	}
	public static void main(String[] args) {
	
		System.out.println("Payment.main()");
		Paymeenttt p = new Paymeenttt ();
		Paymeenttt p1 = new Paymeenttt (100);
	}
	
	static {
		System.out.println("inside sib...only once .....");
	}
	

}
