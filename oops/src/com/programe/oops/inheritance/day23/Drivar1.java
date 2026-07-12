package com.programe.oops.inheritance.day23;

class AccountMgmt  // parent of Account class 
{
	String ifscCode = "SBIN000";
	
	public void someMethod ()
	{
		System.out.println("AccountMgmt.someMethod()");
	}

}
class Accoount extends AccountMgmt  // Account class is child of Accountmgmt 
{
	public void pay()
	{
		Accoount a = new Accoount();
		System.out.println(a.ifscCode); // re-using the parent class attributes in child class 
		a.someMethod(); // we are re-using parent class method
	}
}

public class Drivar1 {

	public static void main(String[] args) {

Accoount a = new Accoount ();
a.someMethod();
a.pay();

	}

}
