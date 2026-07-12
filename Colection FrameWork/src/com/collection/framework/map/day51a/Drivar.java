package com.collection.framework.map.day51a;

import java.util.HashSet;
import java.util.Set;

public class Drivar {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet <String>();
     
		set.add("apple");
		set.add("samsung");
		
		System.out.println("Show : "+set);
		
	}

}

// do debug show where same object  is dummy object index of bucket
// if you useing set is internal useing hashmap map is alwayse putting dummy candidete