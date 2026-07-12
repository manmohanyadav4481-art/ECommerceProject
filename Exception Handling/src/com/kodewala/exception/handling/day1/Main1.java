package com.kodewala.exception.handling.day1;

public class Main1 {
	void pay () {
		String bankName ="SBI";
		String name = null;
		int balance =123;
		
		
		try 
		{
			System.out.println("Excution Before");
			
			System.out.println("BANKName : "+bankName);
			//System.out.print(name.length());
			System.out.println("AccountBalance : "+balance);
			
			System.out.println("After Excution");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	/*	catch(ArthimaticException e)
		{
			
		}*/
	}
	

}
