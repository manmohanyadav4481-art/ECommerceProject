package com.collection.framework.set.treehashset.day49.revision;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Drivar0 {

	public static void main(String[] args) {

		LinkedHashSet<String>city = new LinkedHashSet<String>();
		
		city.add("Lucknow");
		city.add("Noida");
		city.add("Kanpur");
		city.add("Varanasi");
		city.add("Noida");
		city.add("Azamgarh");
		city.add("azamgarh");
		city.add(null);
		city.add(null);
		
		
		System.out.println(city);
	}
}


