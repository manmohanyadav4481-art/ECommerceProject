package com.kodwala.interfa.day36.revision;

public class Drivar2 {

	public static void main(String[] args) {
		
		IBank i = new UpiPayments ();
		i.pay();
		((UpiPayments) i).refund ();
		

	}

}
