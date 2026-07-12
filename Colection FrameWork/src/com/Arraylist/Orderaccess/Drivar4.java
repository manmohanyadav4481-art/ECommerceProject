package com.Arraylist.Orderaccess;

import java.util.ArrayList;

public class Drivar4 {

	public static void main(String[] args) {
		
		// Task = create an arraylist and store element
		
		ArrayList<String>StudentList = new ArrayList<String>();
		
		//Create an object of Arraylist and Store String object
		
		StudentList.add("chaitanya");
		StudentList.add("lokesh");
		StudentList.add("rohit");
		StudentList.add("lokesh");
		StudentList.add("nadeem");
		// total 5 String object have been addend to the list. 
		
		
		//Index based-->
		// appley some operation. find the names which Start with 
	
		for(int i=0; i<StudentList.size(); i++)
		{
			String currentElement = StudentList.get(i);
			if(currentElement.toUpperCase().startsWith("R"))
			{
				System.out.println(currentElement);
			}
		}
	}

}
