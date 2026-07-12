package com.collection.framework.comperatorandcomperable.set.day50;

import java.util.TreeSet;

class Employee5 implements Comparable<Employee5>
{
	int salary;
	String name;
	public Employee5 (int _salary , String _name) 
	{
	
		super();
		this.salary = _salary;
		this.name = _name;
	}
	@Override
	public int compareTo(Employee5 o2) // -ve OR Zero OR +ve
	{
	     
		return (o2.salary - this.salary); // +ve
	}
}


public class Drivar5 {

	public static void main(String[] args) {
	
		// this is insaction order
		Employee5 e1 = new Employee5 (120000, "rohit"); 
		Employee5 e2 = new Employee5 (90000, "shubham");
		
		Employee5 e3 = new Employee5 (130000, "ajhar");
		Employee5 e4 = new Employee5 (40000, "someone");
		
		// are thes compareable ? no
		
		TreeSet<Employee5> ts = new TreeSet <Employee5>(); // will do sorting
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println(ts);
		for(Employee5 e33 : ts)
		{
			System.out.println(e33.name  +" and "+ e33.salary);
		}

		
	}
// this is revase / capare 1 and2 .. large to lower
}