package com.programe.oops.Encap.day22.revision;

public class Main {
	
	 private int balance =100;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

public void doPay ()
{
System.out.println("Main.doPay()");	
}
public void deposite (int amount) 
{
	if(balance>0) {
		balance = balance + amount;
	}else {
		System.out.println("Invalid Amount");
	}
}

}

