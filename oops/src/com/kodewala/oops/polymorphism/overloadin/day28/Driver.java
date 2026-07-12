package com.kodewala.oops.polymorphism.overloadin.day28;

class LoginService
{
	public void doLogingwithMobile (String moblie, int otp) // order of arg or type of args or number of args
	{
		System.out.println("LoginService.doLogingwithMobile((String moblie, int otp))");
	}
	public void doLogingWithAadhar (String aadhar, int otp , String pan)
	{
		System.out.println("LoginService.doLogingWithAadhar((String aadhar, int otp , String pan))");
	}
	public void doLogingWithPan (String pan, String passport)
	{
		System.out.println("LoginService.doLogingWithPan((String pan, String passport))");
	}
}

public class Driver {

	public static void main(String[] args) {
	LoginService log = new LoginService ();
	log.doLogingWithAadhar("12334", 1330, "3433");
	log.doLogingwithMobile("12334", 1230);
	log.doLogingWithPan("man12m", "123man");

	}

}
