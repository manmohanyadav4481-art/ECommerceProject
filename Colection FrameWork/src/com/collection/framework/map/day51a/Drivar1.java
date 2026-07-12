package com.collection.framework.map.day51a;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Drivar1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet <String>();
     
		set.add("apple");
		set.add("samsung");
		
		System.out.println("Show : "+set);
	
		Map<String, String> stateAndCity = new HashMap<String, String>();
	
		stateAndCity.put("Karnataka", "Ahamadabad");
		stateAndCity.put("Maharastra", "Ahamadabad");
		stateAndCity.put("Tamilnadu", "Ahamadabad");
		stateAndCity.put("Telangana", "Ahamadabad");
		stateAndCity.put("Gujrat", "Ahamadabad");
		stateAndCity.put("Gujrat", "Ahamadabad");
		
		System.out.println(stateAndCity);
	}

}
// duplecate key is not  allow // valve duplecate allow