package com.collection.framework.set.treehashset.day49;

import java.util.HashSet;
import java.util.Iterator;

public class Drivar3 {
	
	public static void main (String[]args)
	{
		
		HashSet<String>set  = new HashSet<String>();
		
		
		// Adding the elements
		
		set.add("Kanpur"); // boolean
		set.add("Lucknow");
		set.add("Aligarh");
		set.add("Varansi");
		set.add("Noida");
		set.add("Ayodhya");
		set.add("Azamgarh");
		
		// task - get the city name (s) which starts with 'A'
		
		// How do you read / iterate the collection / set
		
		
		for(String element : set) {
			
			if (element.startsWith("A"))
			{
				System.out.println(element);
			}
		}
	
		System.out.println("***********************************************");
		
		// using iterator
		
		Iterator<String> itr = set.iterator();
		
		while (itr.hasNext()) // check if next element is there or not
		{
			String element = itr.next(); // read the element
			
			if(element.startsWith("A"))
			{
				System.out.println("city start name of A :"+element);
			}
			
			
		}
		
		
	}

}
