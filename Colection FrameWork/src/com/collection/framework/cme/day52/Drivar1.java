package com.collection.framework.cme.day52;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Drivar1 {

	public static void main(String[] args) {
	
		List<String>product = new ArrayList<String>();
		
		product.add("Apple");
		product.add("#Samsung");
		product.add("LG");
		product.add("something");
		
	Iterator<String>itr =product.iterator();
	while(itr.hasNext())
	{
		String element =(String) itr.next();
		if(element.startsWith("L"))
		{
			itr.remove();
			System.out.println("removing the junk element");
		}
		
		System.out.println(product);
	}
	}
}
