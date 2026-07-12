package com.collection.framework.set.day46;

import java.util.HashSet;
import java.util.Set;

public class Drivar4 {

	public static void main(String[] args) {
		
		Set<String>city = new HashSet<String>(16); // 0 to 15th
		
		city.add("Bangalore");
		city.add("Mumbai");
		city.add("Lucknow");
		city.add("Hydrabad");
		city.add("Delhi"); //1th index
		city.add("delhi");//1th index
		
		System.out.println("Delhi".hashCode());
		System.out.println("delhi".hashCode());
		// -65915436 & -->15--> 1th          this is supplie to formula
		//bitwise operator
		System.out.println(city);
		
		
		
		

	}

}