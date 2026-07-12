package com.kodewala.oops.polymorphism.upcast.downcast.day29;

class InvoiceMgmt {
	void pay () {
		System.out.println("InvoiceMgmt.pay");
	}
}

class GSTInvoice extends InvoiceMgmt {
	void pay () {
		System.out.println("GSTInvoice.pay");
	}
	
}

public class Driver {

	public static void main(String[] args) {
	
		GSTInvoice gST = new GSTInvoice ();// simple
		
	// Type      ref name = Actual object
	// int       amount   = 1000;
		
		gST.pay();
		InvoiceMgmt in = new GSTInvoice ();//upcasting auto calling
		
		in.pay();

		GSTInvoice gst = (GSTInvoice)new InvoiceMgmt () ;//downcasting 
		
		gst.pay();
	}

}
