package com.programe.oops.overloadin.inhirt.day28;

class Account 
{
	public void openAccount (String someDetaile)
	{
		System.out.println("Account.openAccount()");
	}
}
class savingAccount extends Account 
{
	public void openAccount (String someDetails)
	{
		System.out.println("savingAccount.openAccount()");
	}
}
class CurrentAccount extends Account 
{
	public void openAccount (String someDetails)
	{
		System.out.println("CurrentAccount.openAccount()");
	}
}
class HybridAccount extends CurrentAccount 
{
	public void openAccount (String someDetails)
	{
		System.out.println("HybridAccount.openAccount()");
	}
}
public class Driver {

	public static void main(String[] args) {
	 
		Account acc = new HybridAccount ();
		acc.openAccount("saving");

	}

}
