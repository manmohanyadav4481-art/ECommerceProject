package com.kodewala.streamAPI;

import java.util.ArrayList;
import java.util.Iterator;

public class Drivar {

	public static void main(String[] args) {
	
		
		ArrayList<String>products = new ArrayList<String>();
		// collection
		//Storing the products
		
		products.add("apple"); // data bese
		products.add("samsung");
		products.add("lg");
		products.add("soney");
		
		// now we need to process the products --->find the products which are starting with "s

		// intar processing  // stream api
	    
		Iterator<String>itr =products.iterator(); // 10 
		while (itr.hasNext()) {
			String product = (String) itr.next();
			if(product.startsWith("s"))
			{
				System.out.println("products is "+product);
			}
		}
		
	}

}
