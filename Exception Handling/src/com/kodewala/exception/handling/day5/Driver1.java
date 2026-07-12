package com.kodewala.exception.handling.day5;

public class Driver1 {

	public static void main(String[] args) {
		
		try {
			
			//String name =args[0];
			int a =10/0;
			
		}catch(NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			e.printStackTrace();
		}
	}

}
