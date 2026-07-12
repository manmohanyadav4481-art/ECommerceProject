package com.programe.oops.Encap.day23;

public class Acoount{
	
	public int balance = 1000;//Data
	
	
	
	//setter
	public void deposit (int _amount) {
		if (_amount>0) {
			balance = balance +_amount;
		}else {
			System.err.println("intvalid amount");
		}
	}
	
	// getter
	
	public int getbalance() {
	return balance;
}
}


