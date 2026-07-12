package com.kodwala.interfa.day36.revision;

public interface BankPayment {
	default void refund () {
		System.out.println("BankPayment.refund()");
	}

}
