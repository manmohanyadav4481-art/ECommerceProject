package com.kodewala.exception.handling.day5;






public class Drivar {

	public static void main(String[] args) {
		
		System.out.println("Drivar.main() start");
		User user = new User();

		try
		{
			user.CreateUser();
		}catch(UserCreationException e)
		{
			e.printStackTrace();
			System.out.println("Unable to create user.pls contact support team ph +91000000");
		}
		System.out.println("Drivar.main() End");
	}

}
class Account
{
	public void CreateAccount()throws FailedToCreateAccountException
	{
		System.out.println("Account.CreateAccount() Start");
		if(true) 
		{
		  throw new FailedToCreateAccountException("unable to create default account");
		}
		System.out.println("Account.CreateAccount() end");
	}
}

class User
{
	public void CreateUser ()
	{
		System.out.println("User.CreateUser() start");
		
		Account a = new Account ();
		
		try
		{
				a.CreateAccount();
		}
		catch ( FailedToCreateAccountException e)
		{
			e.printStackTrace();
			
			throw new  UserCreationException ("unAble Create user");
		
		}
		
		System.out.println("User.CreateUser() end");
	
		}

}

