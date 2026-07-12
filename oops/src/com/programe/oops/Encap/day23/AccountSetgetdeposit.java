package com.programe.oops.Encap.day23;

public class AccountSetgetdeposit {
	int balance = 1200;
	
	//set tar
	public void deposit (int amount) {
		if (amount>0) {
			balance = balance + amount;
		}else {
			System.out.println("invalid amount");
		}
	}
	public int getBalance () {
		return balance;
	}
}
