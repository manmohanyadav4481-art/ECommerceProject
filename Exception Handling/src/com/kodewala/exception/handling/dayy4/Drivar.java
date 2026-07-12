package com.kodewala.exception.handling.dayy4;


class EmailAlreadyExistsException extends RuntimeException
{
	EmailAlreadyExistsException(String _message)
	{
		super(_message);
	}
}
public class Drivar {

	public static void main(String[] args) {
	
		{
		
		String email = args[0];
		
		//logic to check the email...
		boolean isEmailResgisted = true;
		if(isEmailResgisted)
		{
			throw new EmailAlreadyExistsException("Email id "+ email +" already regester");
		}
		
	}

	}

}
