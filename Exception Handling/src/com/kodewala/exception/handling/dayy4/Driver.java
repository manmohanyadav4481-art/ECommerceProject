package com.kodewala.exception.handling.dayy4;




public class Driver
{
	public static void main (String [] args)
	{
		String email = args[0];
		
		UserRegistration rg = new UserRegistration ();
		
		try {
		
		rg. registerUser (email);
	}
	catch (EmailAlreadyExistsException e) {
		
		 // e.printStackTrace();
         System.out.println("Email is already registered . pls connect with support team....");
		{
		
	}
}
}
}
