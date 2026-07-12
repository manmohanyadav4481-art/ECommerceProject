package com.collection.framework.map.day51a;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Drivar0 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet <String>();
     
		set.add("apple");
		set.add("samsung");
		
		System.out.println("Show : "+set);
	
		Map<String, String> stateAndCity = new HashMap<String, String>();
	
		stateAndCity.put("Karnataka", "Bangalore");
		stateAndCity.put("Maharastra", "Mumbai");
		stateAndCity.put("Tamilnadu", "Chennai");
		stateAndCity.put("Telangana", "Hyderabad");
		stateAndCity.put("Gujrat", "Ahamadabad");
		stateAndCity.put("Gujrat", "Ahamadabad");
		
		System.out.println(stateAndCity);
	}

}
// duplecate key is not allow value is allow
