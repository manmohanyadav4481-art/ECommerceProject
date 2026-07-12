package com.Arraylist.Orderaccess;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Drivar2 {

	public static void main(String[] args) {
		
		// Task = create an arraylist and store element
		
		ArrayList<String>StudentList = new ArrayList<String>();
		
		//Create an object of Arraylist and Store String object
		
		StudentList.add("chaitanya"); //added String object to the
		StudentList.add("lokesh");
		StudentList.add("rohit");
		StudentList.add("lokesh");
		StudentList.add("nadeem");
		// total 5 String object have been addend to the list. 
		
		StudentList.add("chaitanya"); //added String object to the
		StudentList.add("lokesh");
		StudentList.add("rohit");
		StudentList.add("lokesh");
		StudentList.add("nadeem");
		StudentList.add("Man");
		
		
		System.out.println(StudentList);

	}

}
