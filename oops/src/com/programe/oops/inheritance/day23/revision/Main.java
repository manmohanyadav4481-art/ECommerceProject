package com.programe.oops.inheritance.day23.revision;

class Bankmgmt 
{
	String ifsce ="sbi00012";
	
	public void doFaundTransfer ()
	{
		System.out.println("Bankmgmt.pay()");
	}
}
class BankPayment extends Bankmgmt
{
	public void payment ()
	{
		BankPayment pa = new BankPayment ();
		System.out.println(pa.ifsce);
		pa.doFaundTransfer();
		System.out.println("BankPayment.payment()");
	}
}

public class Main {

	public static void main(String[] args) {


		BankPayment p = new BankPayment ();
		
		p.doFaundTransfer();
		p.payment();
		

	}

}
