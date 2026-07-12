package com.collection.framework.cme.dayy52;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// if you want to remove / add / list itreatar then use to Iterator method 
// here it will not check modcount and modcount not happene here

public class Drivar4 {

	public static void main(String[] args) {

		List<String> products = new ArrayList<String>();

		products.add("Apple");
		products.add("#Samsung");
		products.add("LG");
		products.add("Something");
		
		Iterator<String>itr =products.iterator();
		while (itr.hasNext()) {
			String element = (String) itr.next();
			if(element.startsWith("#"))
			{
				itr.remove();
				System.out.println("removing the junk element");
			}
			System.out.println(products);
		}

	}
}