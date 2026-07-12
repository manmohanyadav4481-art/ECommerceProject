package com.kodwala.interfa.day37;
@FunctionalInterface
public interface MyInterface {//SAM ---> single abstract method

	public abstract String doSomething ();//public abstract String doSomething ()
	
	public default void doNothing()
	{
	System.out.println("MyInterface.doNothing()");	
	}
}