package com.collection.framework.set.day46;
import java.util.HashSet;
import java.util.Set;

public class Drivar1 {

	public static void main(String[] args) {
		
		Set<String>city = new HashSet<String>();
		
		city.add("Bangalore");
		city.add("Mumbai");
		city.add("Lucknow");
		city.add("Delhi");
		// it is remove all duplicate
		city.add("Bangalore");
		city.add("Mumbai");
		city.add("Lucknow");
		city.add("Delhi");
		
		System.out.println(city);
		
		
		
		

	}

}