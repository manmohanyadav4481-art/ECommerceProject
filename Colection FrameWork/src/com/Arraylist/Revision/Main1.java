package com.Arraylist.Revision;

import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
		
		// create ArrayList and store element
		
		ArrayList<String>EmployeeList = new ArrayList<String>();

		// add element
		
		EmployeeList.add("man");
		EmployeeList.add("Ram");
		EmployeeList.add("Rohan");
		EmployeeList.add("Amit");
		EmployeeList.add("Raju");
		EmployeeList.add("Nayan");
		
		// find the starting with R
		
		for (int i = 0; i<EmployeeList.size(); i++) {
			
			String currentElement = EmployeeList.get(i);
			if(currentElement.toUpperCase().startsWith("R")) {
				System.out.println(currentElement);
			}
		}
		
	}

}
