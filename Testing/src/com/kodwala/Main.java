package com.kodwala;

public class Main {
public static void main(String [] args) {
	System.out.println("Payment.main()............");
	
	Main main = new Main() ;
	main.dopay();
	
}
public void dopay() {
	System.out.println("Main.dopay().........Started");
	
	Paymentpay paymentPay = new Paymentpay();
	
	paymentPay.pay();
	
	System.out.println("Payment.done()....Endeed");
}
}

class Paymentpay{
	public void pay() {
		System.out.println("Pay Done");
	}
}