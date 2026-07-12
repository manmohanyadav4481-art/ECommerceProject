package com.collection.framework.set.treehashset.day49;

import java.util.Iterator;
import java.util.TreeSet;

public class Drivar6 {

	public static void main(String[] args) {

		TreeSet<String> set1 = new TreeSet<String>(); // Not on hashing based (no role of equals and hashcode method)
		
		set1.add("Kanpur");
		set1.add("Ayodhya");
		set1.add("Lucknow");
		set1.add("Mumbai");
		set1.add("delhi");
		set1.add("Bangalore");
		set1.add("ayodhya");
		set1.add("Lucknow");
		//set1.add(null);
		//set1.add(null);
		
		
		System.out.println(set1);



}

}