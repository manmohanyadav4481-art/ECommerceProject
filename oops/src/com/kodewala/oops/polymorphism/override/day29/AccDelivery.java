package com.kodewala.oops.polymorphism.override.day29;

class Delivery {
	void doDelivery () {
		System.out.println("Delivery.doDelivery()");
	}
}
class Ecom extends Delivery {
	void doDelivery () {
		System.out.println("Ecom.doDelivery()");
	}
}
public class AccDelivery {
	public static void main (String []args) {
		Delivery d = new Ecom ();
		d.doDelivery();
		
	}
}
