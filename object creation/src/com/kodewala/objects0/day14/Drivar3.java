package com.kodewala.objects0.day14;

// i able to inislation object

class Payment4 
{
	int amount ; // fields / this are instance variable 
	String txnNote;
	
	// two parametar and argument pass
	public Payment4 (int _amount , String _txnNote)  // this are also call local variable
	{
		System.out.println("Payment.Payment()");
		// inislations
		this.amount = _amount;
		this.txnNote = _txnNote;
	}
}

public class Drivar3 {

	public static void main(String[] args) {
	
		int amount = 100;
		
		Payment4 p = new Payment4 (1000, "credit card bill payment");
		System.out.println("P --> "+p.amount);
		System.out.println("P --> "+p.txnNote);

	}

}
