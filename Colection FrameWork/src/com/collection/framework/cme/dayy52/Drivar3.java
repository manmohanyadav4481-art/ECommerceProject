package com.collection.framework.cme.dayy52;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// here it will not check modcount

public class Drivar3 {

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
				System.out.println("Element"+products);
			}
			
		
		}

	}

}
