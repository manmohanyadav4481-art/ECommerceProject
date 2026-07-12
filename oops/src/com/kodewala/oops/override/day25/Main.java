package com.kodewala.oops.override.day25;

class Employee extends Object
{
	// functionalities
	public void saySometheing ()
	{
		System.out.println("Hello");
	}
}

class Manager extends Employee // manager is child now
{
	public void saySomething()
	{
		System.out.println("Hey Bro");
	}
}

public class Main {

	public static void main(String[] args) {

		Manager mgr = new Manager ();
		mgr.saySometheing();
		

	}

}
