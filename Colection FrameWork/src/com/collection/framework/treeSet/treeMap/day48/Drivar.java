package com.collection.framework.treeSet.treeMap.day48;

import java.util.HashSet;
import java.util.Set;

class City {
	String name;
	
	City (String name)
	{
		this.name = name;
	}
	
	public int hashCode ()
	{
		return 12345;
	}

}

public class Drivar {

	public static void main(String[] args) {
	
		Set<City> city = new HashSet<City> (64);
		
		city.add(new City ("Mumbai1"));
		city.add(new City ("Mumbai2"));
		city.add(new City ("Mumbai3"));
		city.add(new City ("Mumbai4"));
		city.add(new City ("Mumbai5"));
		city.add(new City ("Mumbai6"));
		city.add(new City ("Mumbai7"));
		city.add(new City ("Mumbai8"));
		city.add(new City ("Mumbai9"));
		city.add(new City ("Mumbai10"));
		city.add(new City ("Mumbai11"));
		city.add(new City ("Mumbai12"));

		System.out.println(city.size());
		
		city.add(new City ("Bangalore"));
		city.add(new City ("Lucknow")); 
		
		System.out.println(city);

		
		
		// check you debuge thruogh capcity increase 64  index 57 see all element check next next after before hash code willbe same
		// persent prev hashcode same check you 
		
		
		
	}

}
