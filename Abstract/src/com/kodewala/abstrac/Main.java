package com.kodewala.abstrac;


abstract class Ecom {
	public abstract void takDeliveryOtp ();
	
	public abstract void checkAdd ();
	
	public void stopDelivery ()
	{
		System.out.println("Ecom.stopDelivery()");
	}
}
 class Delivery extends Ecom {
	@Override
	public void takDeliveryOtp () {
		System.out.println("Delivery.takDeliveryOtp()");
	}
	@Override
	public void checkAdd () {
		System.out.println("Delivery.checkAdd()");
	}
	@Override 
	public void stopDelivery () {
		System.out.println("Delivery.stopDelivery()");
	}
}

public class Main {

	public static void main(String[] args) {
		Ecom e = new Delivery ();
		e.takDeliveryOtp();
		e.checkAdd();
		e.stopDelivery();

	}

}
