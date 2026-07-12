package com.collection.framework.set.day46;

import java.util.HashSet;
import java.util.Set;

public class Drivar5 {

	public static void main(String[] args) {
		
		Set<String>city = new HashSet<String>(16); // 0 to 15th
		
		city.add("Bangalore");
		city.add("Mumbai");
		city.add("Lucknow");
		city.add("Hydrabad");
		city.add("Delhi"); //15th index
		city.add("delhi");//15th index
		
		System.out.println("Delhi".hashCode());
		System.out.println("delhi".hashCode());
		// -65915436 & --> 15th
		
		// this formula give the bucket  / this formula you check only where pointed of key of bangalore
		
		int hash = "Bangalore".hashCode();
		 hash = hash ^ (hash >>> 16);

		int capacity = 16; // default initial capacity
		int bucketIndex = (capacity - 1) & hash;

		System.out.println("HashCode = " + hash);
		System.out.println("Bangalore store at Index = " + bucketIndex);
		
		System.out.println(city);
		
		
		
		

	}

}