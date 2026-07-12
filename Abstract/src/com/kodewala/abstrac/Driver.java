package com.kodewala.abstrac;



abstract class Bank {
	
	public abstract void onlinePayment();
	
	public abstract void takefingerPrint ();
	
	public void stopPay ()
	{
		System.out.println("Bank.enclosing_method()");
	}
	 Bank() {
	
		super();
		System.out.println("Bank.Bank()");
	}
	 
	
}

class SBI extends Bank {
	@Override
	public void onlinePayment() {
		System.out.println("SBI.OnlinePayment()");
	}
	
	@Override
	public void takefingerPrint () {
		System.out.println("SBI.takefingerPrint()");
	}
	
	@Override
	public void stopPay () {
		System.out.println("SBI.stopPay()");
	}
	SBI () 
	{
		super ();
	}
	
}
public class Driver {

	public static void main(String[] args) {

    Bank b = new SBI ();
    b.onlinePayment();
    b.takefingerPrint();
    b.stopPay();


	}

}
