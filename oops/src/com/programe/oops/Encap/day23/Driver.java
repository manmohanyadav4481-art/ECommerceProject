package com.programe.oops.Encap.day23;

public class Driver {

	public static void main(String[] args) {
			Acoount a = new Acoount ();
			a.balance = 10000;
			a.deposit(1200);
			System.out.println(a.getbalance());
	}
}
		/*
		BankAccount acc = new BankAccount(1000);
		acc.deposit(500);
		acc.withdraw(200);
		System.out.println("Final Balance : "+ acc.getBalance());
		
		Acoount atm = new Acoount ();
		
		atm.balance = 12000;//not allowed to access balance directly. this is encapsulated
		
		atm.deposit(1200, "123");//Correct Pin, valid deposit
		
		atm.withdraw(200, "123");//Correct PIN, valid withdrawal
		}
}
*/