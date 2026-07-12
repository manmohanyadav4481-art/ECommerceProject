package com.kodwala.loop.day13.revision;

public class Drivar0 {

	public static void main(String[] args) {

		Drivar0 d = new Drivar0 ();
		d.checkCity();
	}
	
	public void checkCity () {
		String product [] = {"Mobile", "HeadPhone" , "Watch" , "Shose" , "AirBid" , "NokiaPhone"};
		
		for(int index = 0; index<product.length; index++)
		{
			String element = product[index];
		  if(element.equalsIgnoreCase("HeadPhone"))
		  {
			  System.out.println("HeadPhone is part of List");
		  }
		  		
					
			
		}
	}
		

	}


