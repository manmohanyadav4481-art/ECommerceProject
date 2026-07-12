package com.collection.framework.set.day48;

import java.util.HashSet;
import java.util.Set;

class Employee1
{
	String name;
	
	public Employee1(String name)
	{
	      super();
	      this.name =name;
	}
	public boolean equals(Object obj)
	{
		Employee e = (Employee) obj;
		return this.name.equals(e.name);
	}
	public int hashCode ()
	{
		return this.name.hashCode();
	}
}

public class Drivar {

	public static void main(String[] args) {

		Set<String>city = new HashSet<String>();
		
		city.add("BLR");
		city.add("LKN");
		city.add("MUM");
		
		System.out.println(city.size());
		
		Set<Employee>emps = new HashSet<Employee>();
		
		Employee e1 = new Employee ("Mumbai");
		Employee e2 = new Employee ("Kanpur");
		Employee e3 = new Employee ("Lucknow");
		Employee e4 = new Employee ("Mumbai");
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		
		System.out.println(emps.size());
		
		System.out.println(e1.hashCode() +" : "+ e4.hashCode() +" and e1 and e4 are same"+e1.equals(e4));	
	
		
	}

}
