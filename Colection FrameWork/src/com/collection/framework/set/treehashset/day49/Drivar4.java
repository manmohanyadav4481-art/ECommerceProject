package com.collection.framework.set.treehashset.day49;


import java.util.HashSet;
import java.util.Iterator;

public class Drivar4 {

	public static void main(String[] args) {

		HashSet<String>city1 = new HashSet<String>();
		
		city1.add("Kanpur");
		city1.add("Lucknow");
		city1.add("Varanasi");
		city1.add("Agra");
		city1.add("Azamgarh");
		city1.add(null);
		city1.add(null);
		
		System.out.println(city1);
		
		for (String element1 : city1)
		{
			if(element1 !=null && element1.startsWith("A"))
			{
				
			}
		}
       Iterator<String> itr = city1.iterator();
       
       while (itr.hasNext())
       {
    	   String element1 = itr.next();
    	   if (element1 !=null && element1.startsWith("A"))
    	   {
    		   
    	   }
       }
	}

}
