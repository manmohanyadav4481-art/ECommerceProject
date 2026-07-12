package com.collection.framework.comperatorandcomperable.set.day50;

import java.util.TreeSet;

class Employee2 implements Comparable
{
	int salary;
	String name;
	public Employee2 (int _salary , String _name) 
	{
	
		super();
		this.salary = _salary;
	}
}


public class Drivar2 {

	public static void main(String[] args) {
	
		Employee2 e1 = new Employee2 (120000, "rohit");
		Employee2 e2 = new Employee2 (9000, "shubham");
		
		// are thes compareable ? no
		
		TreeSet<Employee2> ts = new TreeSet <Employee2>(); // will do sorting
		
		ts.add(e1);
		ts.add(e2);
		
		System.out.println(ts);

		// is saying cannot to be campareable
	}

}