package com.collection.framework.set.day48;

import java.util.HashSet;
import java.util.Set;

class Employee3
{
	String name;
	
	public Employee3 (String name)
	{
		super();
		this.name= name;
	}
	public boolean equals (Object obj)
	{
		Employee3 e0 = (Employee3) obj;
		return this.name .equals(e0.name);
	}
}

public class Drivar2a {

	public static void main(String[] args) {

		Set<String>set = new HashSet<String>();
		
		set.add("BLR");
		set.add("CHE");
		set.add("BLR");
		
		System.out.println(set.size());
		
		Set<Employee3>emps3 = new HashSet<Employee3>();
		
		Employee3 e = new Employee3 ("ritesh");
		Employee3 e1 = new Employee3 ("suraj");
		Employee3 e2 = new Employee3 ("jyoti");
		Employee3 e3 = new Employee3 ("ritesh");
		
		emps3.add(e);
		emps3.add(e1);
		emps3.add(e2);
		emps3.add(e3);
		
		System.out.println(emps3.size());
		
		System.out.println(e.hashCode() +" : "+ e3.hashCode());
		
		


	}

}
