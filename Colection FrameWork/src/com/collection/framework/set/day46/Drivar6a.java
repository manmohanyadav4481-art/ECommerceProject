package com.collection.framework.set.day46;


import java.util.HashSet;
import java.util.Set;

public class Drivar6a {

	public static void main(String[] args) {
		
		Set<String>city = new HashSet<String>(16); // 0 to 15th
		
		city.add("Bangalore");
		city.add("Mumbai");
		city.add("Lucknow");
		city.add("Hydrabad");
		city.add("Delhi"); //15th index
		//city.add("delhi");//15th index
		
		// this formula check hascode is diffrant and but index is same bucket
		// we can not control this jvm dicide 
		
		System.out.println("Delhi".hashCode());
		System.out.println("Lucknow".hashCode());
		// -65915436 & --> 15th
		
		int hash = "Lucknow".hashCode(); // this is element 
		 hash = hash ^ (hash >>> 16); // culculate index input is same output is same

		int capacity = 16; // default initial capacity
		int bucketIndex = (capacity - 1) & hash;

		System.out.println("HashCode = " + hash);
		System.out.println("Bangalore store at Index = " + bucketIndex);
		
		System.out.println(city);
		
		
		
		

	}

}
