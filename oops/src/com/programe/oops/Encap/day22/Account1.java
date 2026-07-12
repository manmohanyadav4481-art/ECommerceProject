package com.programe.oops.Encap.day22;

public class Account1 {
	
	// private
	public int balance; // data / field should be private
	
	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		// check here
		if (balance>0) {
		this.balance = balance;
	}
	}


	public void doFundTransfer ()
	{
		
	}

}
