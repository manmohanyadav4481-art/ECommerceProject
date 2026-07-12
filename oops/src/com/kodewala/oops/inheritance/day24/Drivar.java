package com.kodewala.oops.inheritance.day24;

public class Drivar {

	public static void main(String[] args) {
		

		Notifications n = new Notifications ();
		n.sendEmail("manmohanyadav@gmail.com", "invoice attached");
		n.sendSMS("7021339803", "send amount");
		
		
		Invoice i = new Invoice ();
		i.generateInvoice();
		
		Order o = new Order ();
		o.placeOrder("user121", "mob232", "mobile");
	}

}
