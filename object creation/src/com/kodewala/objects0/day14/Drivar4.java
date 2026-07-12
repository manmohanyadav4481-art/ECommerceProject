package com.kodewala.objects0.day14;

// Instance variable to value here

class Payment5 
{
	int amount ;
	String txtNote;
	
	public Payment5 (int _amount , String _txtNote)
	{
		System.out.println("Payment.Payment()");
		// init
		this.amount=_amount;
		this.txtNote = _txtNote;
	}
}

    public class Drivar4 {

	public static void main(String[] args) {

		Payment5 p0 = new Payment5 (1000, "Credit card bill pay"); // calling constructor
		System.out.println("Payment"+p0.amount);
		System.out.println("Note"+p0.txtNote);

		Payment5 p1 = new Payment5 (8000, "Credit card bill pay"); // calling constructor // store heap
		System.out.println("Payment"+p1.amount);
		System.out.println("Note"+p1.txtNote);


	}

}
