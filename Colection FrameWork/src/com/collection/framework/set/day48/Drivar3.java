package com.collection.framework.set.day48;


import java.util.HashSet;
import java.util.Set;

class Employee4
{
	String name;
	
	public Employee4 (String name)
	{
		super();
		this.name= name;
	}
	// becase he break they contract
	public boolean equals (Object obj)
	{
		Employee4 e0 = (Employee4) obj;
		return this.name .equals(e0.name);
	}
}

public class Drivar3 {

	public static void main(String[] args) {

		Set<String>set = new HashSet<String>();
		
		set.add("BLR");
		set.add("CHE");
		set.add("BLR");
		
		System.out.println(set.size());
		
		Set<Employee4>emps3 = new HashSet<Employee4>();
		
		Employee4 e = new Employee4 ("ritesh");
		Employee4 e1 = new Employee4 ("suraj");
		Employee4 e2 = new Employee4 ("jyoti");
		Employee4 e3 = new Employee4 ("ritesh");
		
		emps3.add(e);
		emps3.add(e1);
		emps3.add(e2);
		emps3.add(e3);
		
		System.out.println(emps3.size());
		
		System.out.println(e.hashCode() +" : "+ e3.hashCode() +" and are e1 and e3 are same ? " +" "+e.equals(e3));
		
		// you check to debug  two element ritesh which index 


	}

}
