package com.kodwala.interfa.day36.revision;


public class UPIPayment implements MBnk, IBnkpay {

	public void pay () {
		System.out.println("Payment don via UPI");

}
	public void refund() {
		System.out.println("Refund done via UPI");
	}

}
