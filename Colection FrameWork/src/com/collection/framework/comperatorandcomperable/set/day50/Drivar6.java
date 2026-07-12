package com.collection.framework.comperatorandcomperable.set.day50;

import java.util.TreeSet;

class Employee6 implements Comparable<Employee6>
{
	int salary;
	String name;
	public Employee6 (int _salary , String _name) 
	{
	
		super();
		this.salary = _salary;
		this.name = _name;
	}
	@Override
	public int compareTo(Employee6 o2) // -ve OR Zero OR +ve
	{
	     
		return (o2.salary - this.salary); // zero
	}
}


public class Drivar6 {

	public static void main(String[] args) {
	
		// this is insaction order
		Employee6 e1 = new Employee6 (120000, "rohit"); 
		Employee6 e2 = new Employee6 (120000, "shubham");
		/**
		Employee5 e3 = new Employee5 (130000, "ajhar");
		Employee5 e4 = new Employee5 (40000, "someone");
		**/
		// are thes compareable ? no
		
		TreeSet<Employee6> ts = new TreeSet <Employee6>(); // will do sorting
		
		ts.add(e1);
		ts.add(e2);
		/*
		ts.add(e3);
		ts.add(e4);
		*/
		System.out.println(ts);
		for(Employee6 e33 : ts)
		{
			System.out.println(e33.name  +" and "+ e33.salary);
		}

		
	}
	// how does identityfy duplicate
// this is identitefy duplicate samthing is returning zero
}