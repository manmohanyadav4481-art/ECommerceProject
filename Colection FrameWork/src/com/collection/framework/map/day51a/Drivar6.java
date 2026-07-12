package com.collection.framework.map.day51a;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// null added

public class Drivar6 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet <String>();
     
		set.add("apple");
		set.add("samsung");
		
	//	System.out.println("Show : "+set);
		
	Iterator<String> itr=set.iterator();
	
	while (itr.hasNext())
	{
		String element = itr.next();
		//System.out.println("element is "+element);
	}

	   // task . store city (valve) and state (key)
	
		Map<String, String> stateAndCity = new HashMap<String, String>();
	
		stateAndCity.put("Karnataka", "Bangalore");
		stateAndCity.put("Maharastra", "Mumbai");
		stateAndCity.put("Tamilnadu", "Chennai");
		stateAndCity.put("Telangana", "Hyderabad"); // 5th bucket --> 0(1) --> "Telengana".hashCode() & is ---> 5th index
		stateAndCity.put("Gujrat", "Ahamadabad");
		stateAndCity.put("Gujrat", "Ahamadabad");
		stateAndCity.put(null, "Bangaluru"); // no duplicate keys
		// null added
		
		//System.out.println(stateAndCity.get("Telangana"));
		
		
		//System.out.println(stateAndCity); // 0(1)
	
		//convert the map to set of entries
		Set<Entry <String, String>> entrySet = stateAndCity.entrySet();
		
		//convert the entry set to iterator 
		
		Iterator<Entry<String, String>> itr1 = entrySet.iterator();
		
		// iterate it
		
		while(itr1.hasNext())
		{
		Entry<String, String>	entry = itr1.next();
		
		System.out.println(entry.getKey() +" and "+entry.getValue());
		}
	}

	// How does hashMap works internally Or How put method works // How does work get 
	// hashMap and put method both same
}