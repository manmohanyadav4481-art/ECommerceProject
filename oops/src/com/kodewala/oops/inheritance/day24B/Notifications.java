package com.kodewala.oops.inheritance.day24B;

public class Notifications {
	
	String countryName="India";// Field zor attribute-->Data
	private String hostName= "send.email.124.543.4.5";
	public void sendEmail(String email, String text, String attachement)   // work or task
	{
		connectToEmailServer ();
		System.out.println("Notifications.sendEmail()");
	}
public void sendSMS(String mobile, String text)
{
	System.out.println("Notifications.sendSMS()");
}
// private
public  void connectToEmailServer () {
	System.out.println("Notification.connectToEmailServer()");
}
}