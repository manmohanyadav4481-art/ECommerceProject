package com.kodewala.sample.day12.revision;

public class Drivar {

	public static void main(String[] args) {

		System.out.println("Drivar.main().................Start");
		
		String name = args[0];
		String add = args [1];
		
		System.out.println("Name : "+name +" |  Address : "+add);
		
		Drivar d = new Drivar ();
		d.done(name,add);
	}
	public void done (String _name , String _add)
	{
		System.out.println("Drivar.done()....................Start");
		
		System.out.println("Name : "+_name +" |  Address : "+_add);
		
		Payment p = new Payment ();
		p.doPay();
	}
}

class Payment 
{

	public void doPay ()
	{
		System.out.println("Payment.doPay() ...............Start");
	}
	
}
