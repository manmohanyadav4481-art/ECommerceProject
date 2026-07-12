package com.kodwala.loop.day13.revision;

public class Drivar8 {
	
	public static void main (String[] args)
	
	{
    
		String product = "Silver";
		
		switch (product)
		{
		
		case "Gold" :
		
		System.out.println("10 % discount");
	     break;
	     
		case "Silver" :
			
			System.out.println("15 % discount");
			break;
			
		case "Platinum" : 
			
			System.out.println("No discount");
			break;
			
		default :
			
			System.out.println("Unknow product");
	     
		}
	}

}
