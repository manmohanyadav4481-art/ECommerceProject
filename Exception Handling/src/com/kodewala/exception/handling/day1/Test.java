package com.kodewala.exception.handling.day1;

public class Test {
static int value = 3;
	public static void main(String[] args) {
		
		System.out.println("This is Sample Program - START");
		
		int amount = 100;
		String name = "Bangalore";
		String address = args[0];
		String nam = args[1];// ArrayIndexOutOfBoundsException
		String amountStr = args[2];// "1a123" ---> NumberFormatException
		int amountt = Integer.parseInt(amountStr);
		
		String pincode ="m123";//NullPointerException
		
		int result = amount/value;//by zero -->ArithmeticException 
		
		System.out.println("Amount : "+amount);
		System.out.println("Name : "+name);
		System.out.println("Name : "+name.length());
		
		System.out.println("Address : "+address);
		
		System.out.println("PinNumber : "+pincode.length());
		
		System.out.println("TotalAmount : "+amountt);
		
		System.out.println("Result : "+result);
		
		System.out.println("Name : "+nam.length());//NullPointerException-->exited
		
		System.out.println("This is Sample Program- END");

	}

}
