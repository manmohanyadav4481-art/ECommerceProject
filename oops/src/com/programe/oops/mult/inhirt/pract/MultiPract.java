package com.programe.oops.mult.inhirt.pract;

class Payment {
	void pay () {
		System.out.println("Generic Payment");
	}
}
class Gpay extends Payment {
	void pay () {
		System.out.println("Gpay Payment");
	}
}
class PhonePay extends Gpay {
	void pay () {
		System.out.println("phone pay payment");
	}
}
class UPI extends PhonePay {
	void pay () {
		System.out.println("Upi payment");
	}
}
public class MultiPract {
public static void main(String[] args) {
		// TODO Auto-generated method stub
     Payment upi = new UPI ();
     upi.pay();
	}

}
