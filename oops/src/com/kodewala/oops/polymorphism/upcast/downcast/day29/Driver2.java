package com.kodewala.oops.polymorphism.upcast.downcast.day29;

class Delivery {
	void doDeliver () {
		System.out.println("Delivery.doDeliver");
	}
}
class Ecommerce extends Delivery {
	void doDeliver () {
		System.out.println("Ecommeerc.doDeliver");
	}
}

public class Driver2 {

	public static void main(String[] args) {
	 Delivery de = new Delivery ();//simple 
	 de.doDeliver();
	 
	 Delivery del = new Ecommerce ();
	 del.doDeliver();
	 

	}

}
