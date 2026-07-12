package com.collection.framework.comperatorandcomperable.set.day50;

import java.util.TreeSet;

class Employee1 implements Comparable
{
	String name;
	
	public Employee1 (String name) 
	{
	
		super();
		this.name = name;
	}
}


public class Drivar1 {

	public static void main(String[] args) {
	
		Employee1 e1 = new Employee1 ("Rohit");
		Employee1 e2 = new Employee1 ("Shubham");
		
		// are thes compareable ? no
		
		TreeSet<Employee1> ts = new TreeSet <Employee1>(); // will do sorting
		
		ts.add(e1);
		ts.add(e2);
		
		System.out.println(ts);

		// this is compile
	}

}
