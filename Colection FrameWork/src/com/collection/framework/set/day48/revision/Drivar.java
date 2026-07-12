package com.collection.framework.set.day48.revision;

import java.util.HashSet;
import java.util.Set;

class Employee
{
	String name;
	
	public Employee (String name)
	{
		super();
		this.name=name;
	}
}

public class Drivar {

	public static void main(String[] args) {

		Set<String>city = new HashSet<String>();
		
		city.add("BLR");
		city.add("MUM");
		city.add("LKN");
		
		System.out.println(city.size());

		// adding dupelecate
		Set<Employee>name = new HashSet<Employee>();
		Employee e = new Employee ("Manmohan");
		Employee e1 = new Employee ("Sumit");
		Employee e2 = new Employee ("Amit");
		Employee e3 = new Employee ("Ajeet");
		
		name.add(e);
		name.add(e1);
		name.add(e2);
		name.add(e3);
		
		System.out.println(name.size());
		
		
		

	}

}
