package com.kodwala.loop.day13.revision;

public class Drivar5 {

	public static void main(String[] args) {

		String city [] = {"Prayagraj" ,"jaunpur", "Azamgarh",null, "Varansi", "Chandauli", "Mirgapur",null,"Bhadohi",null,"Lucknow","Ayodhya", "Goand", "Basti" ,null,"unnao","kanpur"};
		
		for(int index=0; index<city.length; index++)
		{
			String element = city[index];
			if(element == null  || element.equalsIgnoreCase("jaunpur"))
			{
				continue;
			}
			
			System.out.println(element.toUpperCase());
		}


	}

}
