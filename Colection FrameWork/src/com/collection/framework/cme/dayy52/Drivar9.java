package com.collection.framework.cme.dayy52;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
// if you want to modify collectons this become thread safe
// collenctonutill classs
public class Drivar9 {

	public static void main(String[] args) {

		Map<String, String>products = new HashMap<String, String>(); // not exception throw copy write method // fail safe

		products.put("Apple", "iphone15");
		products.put("Samsung", "s32");


  Map<String, String> newProducts =  Collections.synchronizedMap(products);

  //newProducts thered safe (500 buckets)--> 5th bucket is being updated --> 499
  
  Map<String, String> concurrentProducts =  new ConcurrentHashMap<String, String>(1000); //999
  
  concurrentProducts.put("BLR", "TES"); // 10th index
  
  System.out.println(products);
  System.out.println(concurrentProducts);
	}

}