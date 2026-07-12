package com.programe.oops.Encap.day23.revision;


class Account{
	//private data (balance and pin)
	 double balance = 1000.0;
	private String pin = "123";
	
	// public method to withdraw money
	public void withdraw (double amountToWithdraw, String enteredPin)
	{
		System.out.println("Current Balance : "+balance);
		if (enteredPin.equals(pin) && amountToWithdraw <= balance)
		{
			balance = balance - amountToWithdraw;
		System.out.println("Balance Post Withdraw : "+ balance);
	}else
	{
		System.out.println("Error : Incorrect PIN or insufficient funds. ");
		
		}
}
	//public method to deposit money
public void deposit (double amount, String enteredPin)
{
	if(enteredPin.equals(pin))
	{
		balance = balance + amount;
		System.out.println("R"+amount + " deposited New balance: R" + balance);
	}else
	{
		System.out.println("Error : Incorrect PIN.");
	}
}
}

public class Drivar1 {

	public static void main(String[] args) {
		
		Account a = new Account ();
		a.deposit(500, "123");
		

	}

}
