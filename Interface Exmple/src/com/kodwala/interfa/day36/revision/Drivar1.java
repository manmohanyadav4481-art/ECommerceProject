package com.kodwala.interfa.day36.revision;

public class Drivar1 {
public static void main (String[]args) {
	IBnkpay ib = new UPIPayment ();
	ib.refund();
	ib.pay();
	
}
}
