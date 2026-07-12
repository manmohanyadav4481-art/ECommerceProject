package com.collection.framework.comperatorandcomperable.set.day50;

import java.util.TreeSet;

class Employee implements Comparable<Employee>

{
	int salary;
	String name;
	
	public Employee(int _salary, String _name)
	{
	      super();
	      this.salary = _salary;
	      this.name = _name;
	}
	
	@Override
	public int compareTo(Employee ee)
	{
		return (ee.name.compareTo(this.name));
		
	
		
	}
	@Override
	public int compareTo1(Employee ee1)
	{
		return (ee1.salary.compareTo1(this.salary));
}
}

public class Drivar 
{
	public static void main (String [] args)
	{
		Employee e = new Employee (100, "ram");
		Employee e1 = new Employee (1200, "ram");
		Employee e2 = new Employee (1400, "sanoj");
		Employee e3 = new Employee (10700, "ramsakal");
		
		
		TreeSet<Employee>ts = new TreeSet<Employee>();
		
		ts.add(e);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		System.out.println(e.name);
		System.out.println(e.salary);
		
	}
}