package com.Arraylist.addremove;

import java.util.ArrayList;

public class Driver1 {

	public static void main(String[] args) {
		
		ArrayList<String>cities = new ArrayList<String>();
		
		cities.add("MUM");
		cities.add("LKN");
		cities.add("DEL");
		cities.add("CHE");
		cities.add("KOL");
		
		System.out.println(cities.get(2));
		
		cities.remove(3);

		System.out.println(cities);
	}

}
