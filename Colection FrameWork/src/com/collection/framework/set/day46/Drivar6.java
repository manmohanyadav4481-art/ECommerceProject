package com.collection.framework.set.day46;

import java.util.HashSet;
import java.util.Set;

public class Drivar6 {

	public static void main(String[] args) {
		
		Set<String>city = new HashSet<String>(16); // 0 to 15th
		
		city.add("Bangalore");
		city.add("Jaipur");
		city.add("Mysore");
		city.add("Hydrabad");
		city.add("Chennai"); //4th index
		//city.add("delhi");//4th index
		
		System.out.println("Bangalore".hashCode());
		//System.out.println("Chennai".hashCode());
		// -65915436 & --> 4th
		
		// this formula check ne bangalore next mysore
		// both common senario bucket is linked list / cornor senario
		int hash = "Mysore".hashCode();
		 hash = hash ^ (hash >>> 16);

		int capacity = 16; // default initial capacity
		int bucketIndex = (capacity - 1) & hash;

		System.out.println("HashCode = " + hash);
		System.out.println("Bangalore store at Index = " + bucketIndex);
		
		
		System.out.println(city);
		
		// please check bangalore to next mysore doing debuging
		
		

	}

}