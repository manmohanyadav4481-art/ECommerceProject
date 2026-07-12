package com.kodewala.exception.handling.revision1;

public class UserRegistration {

	
	public boolean registerUser (String _email) throws  EmailAlreadyExistsException 
	{
		{
			String email = _email;
			
			boolean isEmailRegister =true;
			if(isEmailRegister)
			{
			throw new EmailAlreadyExistsException ("Email is "+ email +"Already Register");
		}
       return true;
	}

}
}