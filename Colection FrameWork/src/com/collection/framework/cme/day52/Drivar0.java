package com.collection.framework.cme.day52;

import java.util.ArrayList;
import java.util.List;

public class Drivar0 {

	public static void main(String[] args) {
	
		List<String>product = new ArrayList<String>();
		
		product.add("Apple");
		product.add("#Samsung");
		product.add("LG");
		product.add("something");
		
		for(String producte : product) // loop though or iterating the list
		{
			//if(producte.startsWith("#"))
			product.add("Ram");
			{
				product.remove(producte);  // removing the element or modifying the list
			}
	}
}
}