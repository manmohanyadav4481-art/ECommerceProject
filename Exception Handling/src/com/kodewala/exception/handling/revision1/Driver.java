package com.kodewala.exception.handling.revision1;

public class Driver {

	public static void main(String[] args) {
		
		String email = args[0];
		
		UserRegistration rg = new UserRegistration();
		
		try
		{
			rg.registerUser(email);
		}
		catch(EmailAlreadyExistsException e)
		
		{
			//e.printStackTrace();
			System.out.println("Email Already Register");
		}
	}

}
