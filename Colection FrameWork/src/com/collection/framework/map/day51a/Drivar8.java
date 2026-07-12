package com.collection.framework.map.day51a;

import java.util.Map.Entry;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Drivar8 {

	public static void main(String[] args) {
		
		Map<String, String> list = new HashMap<String, String>();
		
		list.put("Apple", "Iphone");
		list.put("Samsung", "s28");
		list.put("RealMe", "nerzo");
		list.put("Nokia", "e32");
		list.put("Nokia", "e32");
		
		
		Set<Entry<String, String>> entrySet = list.entrySet();

		Iterator<Entry <String, String>> iter2 = entrySet.iterator();
  while (iter2.hasNext())
  {
	  Entry<String, String> entry = iter2.next();
	  
	  if(entry.getKey().startsWith("A"))
	  {
		  System.out.println(entry.getKey() +" : and : "+entry.getValue());
	  }
  }
	}

}
