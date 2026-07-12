package com.kodewala.exception.handling.day1;

public class Main {
    
	public static void main(String[] args) {


		String name = "Hello";
		int length =name.length();
		String amountStr = args[0];
		int amount = Integer.parseInt(amountStr);
        String somone = args[1];
        String num ="man";
        
        try
        {
        	System.out.println("Before Exception");
        	
        	System.out.println("Name"+name);
        	System.out.println("Length"+length);
        	System.out.println("Amount"+amountStr);
        	System.out.println("TotalAmount"+amount);
        	System.out.println("Print"+somone);
        	System.out.println("Print"+num);
        }	
        	catch(NullPointerException e)
        	{
        		e.printStackTrace();
        		System.out.println("Name is null");
        	}
        	System.out.println("this is simple program End");
        
        
	}

}
