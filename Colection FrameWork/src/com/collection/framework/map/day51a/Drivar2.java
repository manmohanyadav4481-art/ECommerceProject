package com.collection.framework.map.day51a;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Drivar2 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet <String>();
     
		set.add("apple");
		set.add("samsung");
		
		System.out.println("Show : "+set);
	
		Map<String, String> stateAndCity = new HashMap<String, String>();
	
		stateAndCity.put("Karnataka", "Bangalore");
		stateAndCity.put("Maharastra", "Mumbai");
		stateAndCity.put("Tamilnadu", "Chennai");
		stateAndCity.put("Telangana", "Hyderabad"); // 5th bucket --> 0(1) --> "Telengana".hashCode() & is ---> 5th index
		stateAndCity.put("Gujrat", "Ahamadabad");
		stateAndCity.put("Gujrat", "Ahamadabad"); // no duplicate keys
		
		
		System.out.println(stateAndCity.get("Telangana"));
		
		
		System.out.println(stateAndCity); // 0(1)
	}

	// How does hashMap works internally Or How put method works // How does work get 
	// hashMap and put method both same
}
// duplecate key is not allow value is allow