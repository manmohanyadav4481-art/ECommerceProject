package com.kodwala.interfa.day38.revision;

public interface MyInterface {
 
	String doSomething ();
	
	default void doNothing () {
		System.out.println("MyInterface.doNothing()");
	}
}
