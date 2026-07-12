package com.programe.oops.inherita.overrid.practt;

class Bank {
	Account openAccount () {
		System.out.println("Bank .OpenAccount()");
		return new Account("Basic Account");
	
	}
}
class SBI extends Bank {
	@Override
	SavingAccount openAccount () {
		System.out.println("Sbi.OpentAccount ()");
		return new SavingAccount("Saving Account",5.5);
	}
}
class Account {
	String type;
	Account(String type){
		this.type=type;
	}
}

class SavingAccount extends Account {
	double interest;
	SavingAccount(String type,double interest){
		super(type);
		this.interest=interest;
	}
}
