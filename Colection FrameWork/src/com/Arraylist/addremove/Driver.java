package com.Arraylist.addremove;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String> ();
		
		cities.add("BLR");
		cities.add("CHE");
		cities.add("DEL");
		cities.add("MUM");
		cities.add("LKN");
		
		System.out.println(cities.get(3));
		
		cities.add(2, "PNG");
		
		System.out.println(cities);

	}

}
