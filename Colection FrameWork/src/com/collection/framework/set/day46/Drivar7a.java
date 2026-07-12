package com.collection.framework.set.day46;

import java.util.HashSet;
import java.util.Set;

public class Drivar7a {

	public static void main(String[] args) {
		
		Set<String>city = new HashSet<String>(16); // 0 to 15th
		
		city.add("Bangalore");
		city.add("Mumbai");
		city.add("Lucknow");
		city.add("Hydrabad");
		city.add("Delhi"); //1 index
		//city.add("delhi");//1 index
		
		System.out.println("Delhi".hashCode());
		System.out.println("Delhi".hashCode()); // 1 index both delhi
		// -65915436 & --> 1index
		
		// this formula use the idenditfy the bucket
		//  this requrid two inpute one is hascode 2nd is    total  capcity -1
		int hash = "Bangalore".hashCode();
		 hash = hash ^ (hash >>> 16);

		int capacity = 16; // default initial capacity 
		int bucketIndex = (capacity - 1) & hash;

		System.out.println("HashCode = " + hash);
		System.out.println("Bangalore store at Index = " + bucketIndex);
		
		System.out.println(city);
		
		
		
		

	}

}
