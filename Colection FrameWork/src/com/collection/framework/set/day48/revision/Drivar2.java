package com.collection.framework.set.day48.revision;

import java.util.HashSet;

public class Drivar2 {

	public static void main(String[] args) {
		
		HashSet<String>city = new HashSet<String>();
		
		city.add("Mumbai");
		city.add("Delhi");
		city.add("Lucknow");
		city.add("Varansi");
		city.add("Mirgapur");
		city.add("Chanduali");
		city.add("Azamgary");
		city.add("Devaria");
		city.add("Bhadhohi");
		city.add("jaunpur");
		city.add("Ambedkarnagar");
		city.add("Ayodhya");
		
		System.out.println(city.size());
		
		city.add("Noida");
		
		System.out.println(city.size());

	}

}
