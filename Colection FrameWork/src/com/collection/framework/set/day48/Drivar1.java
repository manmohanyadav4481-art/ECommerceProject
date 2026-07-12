package com.collection.framework.set.day48;


import java.util.HashSet;
import java.util.Set;

class Employee 
{
	String name;
	
	public Employee (String name)
	{
		super();
		this.name= name;
	}
}

public class Drivar1 {

	public static void main(String[] args) {

		Set <String> cities = new HashSet <String>();
		
		cities.add("BLR");
		cities.add("CHE");
		cities.add("BLR");
		
		System.out.println(cities.size()); //2

		// adding duplicate
		Set<Employee>emps1 = new HashSet<Employee>();
		
		Employee e1 = new Employee ("ritesh");
		Employee e2 = new Employee ("suraj");
		Employee e3 = new Employee ("jyoti");
		Employee e4 = new Employee ("ritesh");
		
		emps1.add(e1);
		emps1.add(e2);
		emps1.add(e3);
		emps1.add(e4);
		
		System.out.println(emps1.size()); //4

		// check debug which index add duplicationce
	}

}
