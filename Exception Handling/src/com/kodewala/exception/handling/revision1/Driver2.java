package com.kodewala.exception.handling.revision1;

public class Driver2 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Start tray.....!");
			
			String age =args[0];
			
			System.out.println("End try........!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Age is not found.........!");
		}
		catch(Exception e)
		{
		   System.out.println("Some other exception........");	
		}	

	}

}
