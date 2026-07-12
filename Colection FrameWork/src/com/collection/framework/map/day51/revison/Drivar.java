package com.collection.framework.map.day51.revison;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Drivar {
	public static void main (String[]args)
	{
		Map<String, String>city = new HashMap<String, String>();
		
		city.put("UttarPradesh", "Lucknow");
		city.put("Maharastra", "Mumbai");
		city.put("Bihar", "Patna");
		city.put("Jharkhand", "Ranchi");
		
		Set<Entry<String, String>>entrySet =city.entrySet();
		Iterator<Entry<String, String>>itr =entrySet.iterator();
		
		while(itr.hasNext())
		{
			Entry<String, String>entry =itr.next();
			if(entry.getKey().startsWith("U"))
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
	}
}


