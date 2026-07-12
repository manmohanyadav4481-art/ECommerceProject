package com.kodewala.exception.handling.revision1;

class EmailAlreadyExistsException extends RuntimeException 
{

	 EmailAlreadyExistsException(String _message) 
	{
		super(_message);
		
	}
	
}

public class Drivar {

	public static void main(String[] args) {
	
		String email = args[0];
		
		boolean isEmailRegister=true;
		if(isEmailRegister)

		System.out.println("Email is "+email+" Already Resgister");
	}

}
