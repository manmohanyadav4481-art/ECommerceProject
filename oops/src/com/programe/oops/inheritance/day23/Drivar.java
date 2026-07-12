package com.programe.oops.inheritance.day23;

 class AccountMgMt extends Object  // parent of Account class 
{
	
	public void someMethod ()
	{
		hashCode();
		System.out.println("AccountMgMt.someMethod()");
	}

}
class Account extends AccountMgMt  // Account class is child of Accountmgmt 
{
	public void pay()
	{
		hashCode();
		System.out.println("Account.pay()");
	}
}

public class Drivar {
	public static void main (String[]args) {
		
		Account a = new Account ();
		a.pay();
		a.someMethod();
	}
}