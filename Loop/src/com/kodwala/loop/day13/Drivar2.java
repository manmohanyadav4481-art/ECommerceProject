package com.kodwala.loop.day13;

public class Drivar2 {

	public static void main(String[] args) {

		System.out.println("Main -  STARTED");
		
		Drivar2 dr = new Drivar2 ();
		
		dr.checkCity();
		
		System.out.println("Main - Ended");
		

	}
	
	public void checkCity ()
	{
		String city [] = {null," Mumbai ", "Delhi", "Bangalore", "Jaipur", "Lucknow"};
	
		for (int index=0; index<city.length; index++) {
			
			String currentCity = city[index];
			
			if(currentCity==null)
			{
				System.out.println("null city found exiting from method");
			   
				return;
			}
			
			if(currentCity.equalsIgnoreCase("Bangalore"))
			{
			  System.out.println("Bangalore is part of city of list");	
			  break;
			  
			  // null point index is return
			}
			
		}
		
	}

}
