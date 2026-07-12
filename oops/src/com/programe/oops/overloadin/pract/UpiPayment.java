package com.programe.oops.overloadin.pract;

class UpiPay {
	public void pay (String name , int amount) {
		System.out.println("Name : "+name);
		System.out.println("Amount : "+amount);
	}
}
class Gpayj extends UpiPay {
	public void pay (String name , int amount , String note) {
		System.out.println("Name : "+name);
		System.out.println("Amount : "+amount);
		System.out.println("Nont : "+note);
	}
}
public class UpiPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UpiPay upipay = new Gpayj ();
		upipay.pay("Mohan", 1100);
		
		
Gpayj gpay = new Gpayj ();
gpay.pay("Man",110, "Pay");
	}

}
