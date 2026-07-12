package com.kodwala.loop.day13;

public class Drivar {

	public static void main (String [] args) {
		
		System.out.println("Main - Started");
		
		Drivar d = new Drivar ();
		d.checkCity();
	
		System.out.println("Main - Ended");
		
	}
		
		public void checkCity () {
		//initialase
		String city [] = { "Chennai", "Bangalore", "Delhi", "Ahmedabad", "Jaipur", "Mysore"};
		// Task - chedk if city (Bangalore) exists in the given array or not.
	
		for(int i=0; i<city.length; i++) {
		
		String currentCity = city[i];
		
		if(currentCity.equalsIgnoreCase("Bangalore"))
		{
				System.out.println("Bangalore is part of the list");
				break;
		}
		
	}
	}
}
