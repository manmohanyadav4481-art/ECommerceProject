package com.kodewala.objects4.day15.revision;

class Invoice 
{
	int amount ;
	String name;
	String iteam;
	String status;
	int qty;
	
	 public Invoice (int _amount, String _name)
	{
	   this.amount= _amount;
	   this.name = _name;
	}
	 public Invoice (int _amount, String _name, String _iteam)
	 {
		 this.amount= _amount;
		 this.name = _name;
		 this.iteam = _iteam;
	 }
	 public Invoice (int _amount , String _name, String _iteam , String _status)
	 {
		 this.amount= _amount;
		 this.name = _name;
		 this.iteam = _iteam;
		 this .status = _status;
	 }
	 
	 public Invoice (int _amount, String _name, String _iteam, String _status, int _qty)
	 {
		 this.amount= _amount;
		 this.name= _name;
		 this.iteam = _iteam;
		 this.status = _status;
		 this.qty =  _qty;
	 }
}

public class Drivar 
{

	public static void main (String [] args)
	{
		System.out.println("Drivar.main()");
		
		Invoice i = new Invoice (1200, "Neeraj");
		System.out.println("Name : "+i.name +" | Amount : "+i.amount);
		
		Invoice i1 = new Invoice (1300, "Ram", "Food");
		
		System.out.println("Name : "+i1.name +" | Amount : "+i1.amount +" | Iteam : "+i1.iteam);
		
		Invoice i2 = new Invoice (1500, "Raj", "Food", "Successfull");
	
		System.out.println("Name : "+i2.name +" | Amount : "+i2.amount +" | Iteam : "+i2.iteam +" |Status : "+i2.status);
		
		Invoice i3 = new Invoice (1500, "Raj", "Food", "Successfull", 15);
		
		System.out.println("Name : "+i3.name +" | Amount : "+i3.amount +" | Iteam : "+i3.iteam +" |Status : "+i3.status +" | Qty : "+i3.qty);
		
		
		
	}
}


