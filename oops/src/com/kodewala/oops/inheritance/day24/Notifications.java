package com.kodewala.oops.inheritance.day24;

public class Notifications {
	
	String countryName="India";// Field zor attribute-->Data
	
	public void sendEmail(String email, String text)   // work or task
	{
		System.out.println("Notifications.sendEmail()");
	}
public void sendSMS(String mobile, String text)
{
	System.out.println("Notifications.sendSMS()");
}
}

