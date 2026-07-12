package com.kodewala.exception.handling.revision1;

public class Drivar4 {

	public static void main(String[] args) {
	
		try
		{
			System.out.println("Start try............!");
			
			String bankName = args[0];
			
			System.out.println(bankName);
			
			System.out.println("End try.............!");
		}
        catch(ArrayIndexOutOfBoundsException e)
		{
        	System.err.println("BankName is not Found");
		}
		catch(Exception e )
		{
			System.out.println("Some Other Problem");
		}
	}

}
