package com.collection.framework.set.day48;

import java.util.HashSet;

public class Drivar6 {

	public static void main(String[] args) {

		HashSet<String>set = new HashSet <String>();

		set.add("BLR1");
		set.add("BLR2");
		set.add("BLR3");
		set.add("BLR4");
		set.add("BLR5");
		set.add("BLR6");
		set.add("BLR7");
		set.add("BLR8");
		set.add("BLR9");
		set.add("BLR10");
		set.add("BLR11");
		set.add("BLR12");
		
		System.out.println(set);
		// reHashing trigger
		set.add("BLR13");
		
		System.out.println(set);
	
		// check debug capcity incrising threshold and loadfactor
	    // this movement is call reHashing
	}

}
