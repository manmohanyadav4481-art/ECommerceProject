package com.kodwala.loop.day13.revision;

public class Drivar4 {

	public static void main(String[] args) {

		String subject [] = {"Hindi", "English", "Sanskrit", "Mathmatic","science", "Economice", "giographic", "History", "political science"};
		
		for(int index=0; index<subject.length; index++)
		{
			String element = subject[index];
			
			if(element.equalsIgnoreCase("Sanskrit")) {
				continue;
			}
			System.out.println(element.toUpperCase());
		}
		
	}
}




