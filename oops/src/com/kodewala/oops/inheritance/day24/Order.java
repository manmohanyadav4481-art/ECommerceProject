package com.kodewala.oops.inheritance.day24;

public class Order extends Notifications { // Notification is a parent for order class

	public void placeOrder(String userId, String productId, String someOtherInfo)
	{
		System.out.println("Order.placeOrder()");
		//once order placed , System/platform need to send an update over email/sms 
	    //String userId = "123";
		String email = "user123@gmail.com";
	    String text = "You order has been successfully placed";
	    sendEmail(email,text);
	    //sendEmail(userId, text, email); // parent class method i am able to use
	}
	public void sendNotification () //200 lines of code--> tested(qa)--good to move forward
	{
		// collecting data
		// preparing it 
		// connecting to email / sms server
		// sending notification
	}
}
