package com.kodewala.objects4.day15;


class OrderMgmt1
{
	// empliset super constructor
	OrderMgmt1 ()
	{
	super(); // calling object class constructor
    System.out.println("OrderMgmt.OrderMgmt()");
	}
}
class Order3 extends OrderMgmt1{
	
	public Order3 () {
		//  first line constructor either super () or this ()
		this("kodewala"); // call super class no arg constructor
	   System.out.println("Order2.Order2()");
	}
	public Order3 (String name) 
	{
		super ();
		System.out.println("Order2.Order2(name)");
	}
}

public class Drivar3 extends Object{

	public static void main(String[] args) {

		Order3 dr = new Order3 (); // call the constructor
		//dr.hashCode(); // hashcode is drivar parente class
	}

}