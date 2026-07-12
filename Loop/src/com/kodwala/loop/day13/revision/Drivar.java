package com.kodwala.loop.day13.revision;

public class Drivar {

	public static void main(String[] args) {

		Drivar d = new Drivar ();
		d.checkCity();

	}
		public void checkCity ()
		{
			// inislase
			String city [] = { "Delhi", "Mumbai" , "Bangalore", "Chennai", "Lucknow", "Varansi" ," Azamgarh"};
			
			// method applly
			
			for(int index = 0; index<city.length; index++)
			{
				String currentCity = city[index];
				
				if (currentCity.equalsIgnoreCase("Bangalore"))
				{
					System.out.println("Bangalore is part of list");
					break;
				}
			}
			
		}

	}


