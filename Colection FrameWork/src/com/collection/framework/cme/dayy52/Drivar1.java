package com.collection.framework.cme.dayy52;

import java.util.ArrayList;
import java.util.List;

public class Drivar1 {
public static void main (String[]args)
{
	List<String>products =new ArrayList<String>();
	
	products.add("Apple");
	products.add("#Samgung");
	products.add("LG");
	products.add("Something");
	
	for(String product : products ) // loop though or iterating the list// every time check modcount == expectedmodcount
	{
		if(product.startsWith("#"))
		{
			products.add("test");  // removing the element or modifying the list
		}
	}
		
}
}
