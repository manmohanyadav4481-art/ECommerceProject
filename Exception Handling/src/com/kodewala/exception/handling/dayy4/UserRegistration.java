package com.kodewala.exception.handling.dayy4;

import java.io.IOException;

public class UserRegistration {
	
	public 	boolean  registerUser(String _email) throws EmailAlreadyExistsException ,NullPointerException//check and ,UncheckException , IOException , NumberFormateException 
		{
			String email =_email;
			
			//logic to check the email....with DB and if already available the return true
			boolean isEmailResgisted = true;
			if(isEmailResgisted)
			{
				throw new EmailAlreadyExistsException ("Email id "+ email +" already registered");
		         // new person ("test")	;
			}
			return true;
		}
}

