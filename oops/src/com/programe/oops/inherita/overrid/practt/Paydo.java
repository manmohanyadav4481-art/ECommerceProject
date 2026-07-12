package com.programe.oops.inherita.overrid.practt;

class PaymentSystem {
	void doPayment (int accNo, int amount, String name) {
		System.out.println("Account Number : "+accNo);
		System.out.println("Balance Amount : "+amount);
		System.out.println("AccountHolderName : "+name);
		
		
		System.out.println("------Details---------");
	}

}

class UPI extends PaymentSystem {
	void doPayment (int accNo, int amount, String name) {
		System.out.println("Account Number : "+accNo);
		System.out.println("Balance Amount : "+amount);
		System.out.println("AccountHolderName : "+name);
	}
}

public class Paydo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//PaymentSystem pa = new UPI ();
	UPI upi = (UPI) new PaymentSystem ();
//pa.doPayment(11313, 11130, "Mohan");
//pa.doPayment(21213434, 11130, "Ram");
upi.doPayment(11313, 11130, "Mohan");
upi.doPayment(21213434, 11130, "Ram");

	}

}
