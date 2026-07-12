package com.kodwala.interfa.day36.revision;

public class UpiPayments implements IBank, BankPayment {

 public	void pay () {
		System.out.println("UpiPayments.pay()");
	}
 public void refund () {
	 System.out.println("UpiPayments.refund()");
 }
	}