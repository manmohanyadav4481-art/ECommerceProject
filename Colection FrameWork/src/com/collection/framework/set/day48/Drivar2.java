package com.collection.framework.set.day48;

import java.util.HashSet;
import java.util.Set;

class Employee3a
{
	String name;
	
	public Employee3a (String name)
	{
		super();
		this.name= name;
	}
}

public class Drivar2 {

	public static void main(String[] args) {

		Set<String>set = new HashSet<String>();
		
		set.add("BLR");
		set.add("CHE");
		set.add("BLR");
		
		System.out.println(set.size());
		
		Set<Employee3a>emps3 = new HashSet<Employee3a>();
		
		Employee3a e = new Employee3a ("ritesh");
		Employee3a e1 = new Employee3a ("suraj");
		Employee3a e2 = new Employee3a ("jyoti");
		Employee3a e3 = new Employee3a ("ritesh");
		
		emps3.add(e);
		emps3.add(e1);
		emps3.add(e2);
		emps3.add(e3);
		
		System.out.println(emps3.size());
		
		System.out.println(e.hashCode() +" : "+ e3.hashCode());
		
		// check through debug two ritesh store diffrant of bucket and diffrent hashcode  
		


	}

}