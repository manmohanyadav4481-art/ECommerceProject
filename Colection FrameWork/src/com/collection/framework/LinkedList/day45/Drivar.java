package com.collection.framework.LinkedList.day45;

import java.util.LinkedList;

public class Drivar {

	public static void main(String[] args) {

		LinkedList <String>list = new LinkedList<String>();
		list.add("mumbai");
		list.add("chennai");
		list.add("Hyderabad");
		list.add("Delhi");
		list.add("Delhi");
		list.add("Bangalore");
		
		System.out.println(list);
	
		list.add(2, "Jaipur");
	
		System.out.println(list);
		
		list.remove(3);
		
		System.out.println(list);
		
	}

}
