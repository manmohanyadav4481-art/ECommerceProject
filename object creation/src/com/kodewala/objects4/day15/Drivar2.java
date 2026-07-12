package com.kodewala.objects4.day15;

class OrderMgmt
{
	// empliset super constructor
	OrderMgmt (int amt)
	{
	super(); // calling object class constructor
	System.out.println("super argument amount : "+amt);
   System.out.println("OrderMgmt.OrderMgmt()");
	}
}
class Order2 extends OrderMgmt{
	
	public Order2 () {
		//  first line constructor either super () or this ()
		super (200); // call super class no arg constructor
	System.out.println("Order2.Order2()");
	}
	
}

public class Drivar2 extends Object{

	public static void main(String[] args) {

		Order2 dr = new Order2 (); // call the constructor
		dr.hashCode(); // hashcode is drivar parente class
	}

}
