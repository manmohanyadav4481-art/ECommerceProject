package com.collection.framework.set.treehashset.day49;

import java.util.HashSet;
import java.util.Iterator;

public class Drivar2 {
	
	public static void main (String[]args)
	{
		
		HashSet<String>set  = new HashSet<String>();
		
		
		// Adding the elements
		
		set.add("BLR"); // boolean
		set.add("Chennai");
		set.add("delhi");
		set.add("Ahmedabad");
		set.add("Hyderadbad");
		set.add("Ayodhya");
		set.add("Azamgarh");
		
		// task - get the city name (s) which starts with 'A'
		
		// How do you read / iterate the collection / set
		
		
		for(String element : set) {
			
			if (element.startsWith("A"))  // processing logic
			{
				System.out.println(element);
			}
		}
	}
}