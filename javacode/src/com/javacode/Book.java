package com.javacode;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main - Started");
Book exp = new Book();

exp.checkcity();

System.out.println ("Main - Ended");
	}
	
	
	public void checkcity() {
		String cities [] = {"Chennai", "Mumbai", "Bangalore", "Dhelhi", "Kolkata"};
		for(int i = 0; i <cities.length; i++) {
			
			String currentcity = cities[i];
			if (currentcity.equalsIgnoreCase("Bangalore")) {
				System.out.println("Bangalore is part of the city list");
				break;
			}
	}

}
}
