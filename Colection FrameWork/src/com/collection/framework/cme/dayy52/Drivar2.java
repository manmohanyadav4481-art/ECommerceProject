package com.collection.framework.cme.dayy52;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// this same requarment

public class Drivar2 {

	public static void main(String[] args) {

		List<String> products = new ArrayList<String>();

		products.add("Apple");
		products.add("Samsung");
		products.add("LG");
		products.add("Something");
		
		Iterator<String>itr =products.iterator();
		while (itr.hasNext()) {
			String element = (String) itr.next();
			System.out.println(element);
		}

	}

}
