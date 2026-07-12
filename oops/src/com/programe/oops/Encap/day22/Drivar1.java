package com.programe.oops.Encap.day22;

public class Drivar1 {

	public static void main(String[] args) {
		
		Account1 a = new Account1 (); // this is allowe to negitive balance
		
		a.balance = -100000; // if private note the geting
		
		a.setBalance(-100000);
		System.out.println(a.getBalance());

	}

}
