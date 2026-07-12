package com.collection.framework.map.day51;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Drivar {

	public static void main(String[] args) {

		Map <String, String> stateandCity  = new HashMap<String, String>();


		stateandCity.put("Karnataka", "Bangalore");
		stateandCity.put("Maharashtra", "Mumbai");
		stateandCity.put("UttarPradesh", "Lucknow");
		stateandCity.put("Bihar", "Patna");
		stateandCity.put(null, "Patna");
	
		Set<Entry<String, String>> entrySet = stateandCity.entrySet();
	
		Iterator<Entry<String, String>> itr1 = entrySet.iterator();
	
		while (itr1.hasNext())
		{
			Entry<String, String> entry = itr1.next();
		    System.out.println(entry.getKey() +" and "+entry.getValue());
		}
	}

}
