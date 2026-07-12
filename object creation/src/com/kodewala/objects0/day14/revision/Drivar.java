package com.kodewala.objects0.day14.revision;

class Account
{
	String name;
	  int amount;
	String note; 
	
	Account (String _name, int _amount, String _note)
	{
		this.name= _name;
		this.amount = _amount;
		this.note = _note;
	}
}


public class Drivar {

	public static void main(String[] args) {
	
		Account p = new Account ("manmohan", 12, "Pay");
		Account p1 = new Account ("Rohan", 1200, "pay");
		
		System.out.println("Mohan : "+p.name);
		
		System.out.println("Amount : "+p.amount);
		
		System.out.println( "Ramesh : "+ p1.name);
		System.out.println( " Amount : "+p1.amount);
		p.hashCode();
		
		System.out.println();
		
	}

}
