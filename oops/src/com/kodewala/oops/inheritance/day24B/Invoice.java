package com.kodewala.oops.inheritance.day24B;


public class Invoice extends Notifications {
	
	public void generateInvoice ()
	{
		System.out.println("Invoice.generateInvoice()");
		// once invoice is generate we need to send over email
      
		sendEmail("user123", "please find attached invoice", "path for attachement");
	}

}
