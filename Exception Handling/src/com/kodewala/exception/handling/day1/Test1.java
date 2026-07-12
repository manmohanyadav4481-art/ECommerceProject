package com.kodewala.exception.handling.day1;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("Program Start");
		String name = null;
		
		int amount = 200;
		
		System.out.println("Amount : "+amount);
		
		try
		{
			int price =100/0;
			System.out.println("Before Exception");
			
			System.out.println("length : "+name.length());// Risky  -->my throw exception
			
			System.out.println("Price : "+price);
			
			System.out.println("After Exception");//Skipped in case of NPE
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Name is null...");//massage
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("can not divide by zero");//message
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong!");
		}
		System.out.println("Program End");
	}

}
