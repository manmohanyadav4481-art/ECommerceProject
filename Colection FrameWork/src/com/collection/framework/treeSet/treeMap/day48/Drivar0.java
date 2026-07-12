package com.collection.framework.treeSet.treeMap.day48;

import java.util.HashSet;
import java.util.Set;

class City1 {
	
	String name;
	
	City1 (String name)
	{
		this.name = name;
	}
	public int hashCode ()
	{
		return 1234;
	}
}

public class Drivar0 {

	public static void main(String[] args) {
	
		Set<City1> city = new HashSet<City1> (16);
		
		city.add(new City1 ("Mumbai1"));
		city.add(new City1 ("Mumbai2"));
		city.add(new City1 ("Mumbai3"));
		city.add(new City1 ("Mumbai4"));
		city.add(new City1 ("Mumbai5"));
		city.add(new City1 ("Mumbai6"));
		city.add(new City1 ("Mumbai7"));
		city.add(new City1 ("Mumbai8"));
		city.add(new City1 ("Mumbai9"));
		city.add(new City1 ("Mumbai10"));
		city.add(new City1 ("Mumbai11"));
		city.add(new City1 ("Mumbai12"));

		System.out.println(city.size());
		
		// check debug here  Til  capcity 32 index and threshold 24 size and loadfactor  
		
		
	
	}
	
}
