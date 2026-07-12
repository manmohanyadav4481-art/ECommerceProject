package com.collection.framework.set.day48;

import java.util.HashSet;
import java.util.Set;

class Employee5
{
	String name;
	
	public Employee5 (String name)
	{
		super();
		this.name= name;
	}
	// becase he break they contract
	public boolean equals (Object obj)
	{
		Employee5 e0 = (Employee5) obj;
		return this.name .equals(e0.name);
	}
	
	public int hashCode ()
	{
		return this.name.hashCode();
	}
}

public class Drivar4 {

	public static void main(String[] args) {

		Set<String>set = new HashSet<String>();
		
		set.add("BLR");
		set.add("CHE");
		set.add("BLR");
		
		System.out.println(set.size());
		
		Set<Employee5>emps3 = new HashSet<Employee5>();
		
		Employee5 e = new Employee5 ("ritesh");
		Employee5 e1 = new Employee5 ("suraj");
		Employee5 e2 = new Employee5 ("jyoti");
		Employee5 e3 = new Employee5 ("ritesh");
		
		emps3.add(e);
		emps3.add(e1);
		emps3.add(e2);
		emps3.add(e3);
		
		System.out.println(emps3.size());
		
		System.out.println(e.hashCode() +" : "+ e3.hashCode() +" and are e1 and e3 are same ? " +" "+e.equals(e3));
		
		// you check to debug  two element ritesh which index 


	}

}