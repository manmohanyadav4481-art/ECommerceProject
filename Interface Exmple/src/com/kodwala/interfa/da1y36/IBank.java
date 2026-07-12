package com.kodwala.interfa.da1y36;

public interface IBank {
	
	default void pay ()
	 {
		 System.out.println("IBank.pay()");
	 }

}
