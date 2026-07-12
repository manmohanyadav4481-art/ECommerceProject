package com.kodewala.exception.handling.revision.day5;



public class Main5 {
public static void main (String[]args) {
 
	User u = new User ();
	
	try
	{
      u.userCreate();		
	}catch (UserCreationException e)
	{
		e.printStackTrace();
	}
}
}


class Account 
{
	public void createAccount () throws FailedToCreateAccountException
	{
		if(true)
		{
			
			throw new FailedToCreateAccountException ("Unable to Creat to account");
		}
	}
}

class User {
	public void userCreate () {
		
	Account a = new Account ();
	
	try
	{
		a.createAccount();
	
	}catch (FailedToCreateAccountException e)
	{
		e.printStackTrace();
		
		throw new UserCreationException ("Unable to user Create");
	}
}
}
