package com.collection.framework.HashSet.day48;

import java.util.HashSet;

public class Drivar {

	public static void main(String[] args) {

		HashSet<String>set = new HashSet<String>(16);

		set.add("Lucknow1");
		set.add("Lucknow2");
		set.add("Lucknow3");
		set.add("Lucknow4");
		set.add("Lucknow5");
		set.add("Lucknow6");
		set.add("Lucknow7");
		set.add("Lucknow8");
		set.add("Lucknow9");
		set.add("Lucknow10");
		set.add("Lucknow11");
		set.add("Lucknow12");

		System.out.println(set);
		
		set.add("Kanpur13");
		
		System.out.println(set);
		
		
	}

}
