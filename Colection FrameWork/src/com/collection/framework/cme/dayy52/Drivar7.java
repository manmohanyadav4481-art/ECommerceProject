package com.collection.framework.cme.dayy52;


import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
// if you want to modify collectons
public class Drivar7 {

	public static void main(String[] args) {

		List<String> products = new CopyOnWriteArrayList<String>(); // not exception throw copy write method // fail safe

		products.add("Apple");
		products.add("#Samsung");
		products.add("LG");
		products.add("Something");

  List<String> newProduct =  Collections.unmodifiableList(products);

  newProduct.add("test");
	}

}
