package com.Arraylist.Revision;

import java.util.LinkedList;

public class DrivarHdfc {

	public static void main(String[] args) {

		LinkedList<String>student = new LinkedList<String>();

        // add element
		
		student.add("Ram");
		student.add("Raja");
		student.add("Amit");

		student.add("Ramraj");
		student.add("mohan");
		student.add("Arun");
		
		System.out.println(student);
		
		student.add(2, "Sonu");
		
		System.out.println(student);
		
		
	}
}