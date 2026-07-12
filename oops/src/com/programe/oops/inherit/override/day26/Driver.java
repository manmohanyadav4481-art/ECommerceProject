package com.programe.oops.inherit.override.day26;

class PaymentSystem 
{
	public void doPaymentSystem () {
		System.out.println("PaymentSystem.doPaymentSystem()");
		
	}
}
class PhonePay extends PaymentSystem
{
	public void doPhonePay () {
		System.out.println("PhonePay.doPhonePay()");
		
	}
}
class GPay extends PaymentSystem
{
	public void doGPay () {
		System.out.println("GPay.doGPay()");
		
	}
}
public class Driver {

	public static void main(String[] args) {
		
		 PaymentSystem p = new GPay ();
		p.doPaymentSystem();

	}

}
