package com.programe.oops.Encap.day23.revision;

class BankAccount {
	private double balance; //private data member
	
	public BankAccount(double balance)
	{
		this.balance = balance;
		
	}
	
	public double getBalance () // getter method to view balance {read-only access}
	{
		return balance;
	}
	
	public void deposit(double amount)// method to deposit money
	{
		if (amount>0)
		{
			balance += amount;
			System.out.println("Deposited : "+ amount);
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw(double amount)// method to withdraw money
	{
		if (amount >0 && amount <= balance)
		{
			balance -= amount;
			System.out.println("Withdrawn : "+ amount);
		}else {
			{
				System.out.println("Insufficient fund or invalid amount !");
			}
		}
	}
}

public class Drivar {
	public static void main (String[]args) {
		
		BankAccount a = new BankAccount (1000);
		
		a.deposit(500);
		a.withdraw(100);
		System.out.println(a.getBalance());
		
	}
}