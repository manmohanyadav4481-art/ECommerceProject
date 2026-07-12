package com.collection.framework.cme.dayy52;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
//

public class Drivar8a {

	public static void main(String[] args) {

		Map<String, String>products = new HashMap<String, String>(); // not exception throw copy write method // fail safe

		products.put("Apple", "iphone15");
		products.put("Samsung", "s32");


  Map<String,String> newProduct =  Collections.synchronizedMap(products);

  newProduct.put("Mobile", "Nokia");
  
  System.out.println(newProduct);
	}

}