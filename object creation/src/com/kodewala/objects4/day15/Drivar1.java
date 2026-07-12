package com.kodewala.objects4.day15;


class Order1 extends Object {
	
	public Order1 () {
		//  first line constructor either super () or this ()
		super (); // call super class no arg constructor
	System.out.println("Order1.Order1()");
	}
	
}

public class Drivar1 extends Object{

	public static void main(String[] args) {

		Order1 dr = new Order1 (); // call the constructor
		dr.hashCode(); // hashcode is drivar parente class
	}

}
