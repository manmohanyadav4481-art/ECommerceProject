package com.kodewala.oops.inheritance.day24B;



public class Order extends Notifications { // Notification is a parent for order class

	public void placeOrder(String userId, String productId, String someOtherInfo)
	{
		System.out.println("Order.placeOrder()");
		//once order placed , System/platform need to send an update over email/sms 
	    String text = "You order has been successfully placed";
	    sendEmail(userId, text, null); // parent class method i am able to use
	  // connectToEmailServer();
	    System.out.println(countryName);
	  //  System.out.println(hostName);
	}
}