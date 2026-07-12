package com.kodwala.interfa.day36.revision;

public interface IBank {
	default void pay () {
		System.out.println("IBank.pay()");
	}

	

}
