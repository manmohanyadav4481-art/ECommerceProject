package com.collection.framework.cme.dayy52;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// if you want to remove / add / list itreatar then use to Iterator method 
// here it will not check modcount and modcount not happene here
// it will maintane they copy // not check modcount
public class Drivar6 {

	public static void main(String[] args) {

		List<String> products = new CopyOnWriteArrayList<String>(); // not exception throw copy write method // fail safe

		products.add("Apple");
		products.add("#Samsung");
		products.add("LG");
		products.add("Something");
		
		Iterator<String>itr =products.iterator();
		while (itr.hasNext()) {
			String element = (String) itr.next();
			
			products.remove("LG");
			
				System.out.println("removing the junk element");
			}
			System.out.println(products);
		}

	}
