package com.collection.framework.comperatorandcomperable.set.day50;


import java.util.TreeSet;

class Employee4 implements Comparable<Employee4>
{
	int salary;
	String name;
	public Employee4 (int _salary , String _name) 
	{
	
		super();
		this.salary = _salary;
		this.name = _name;
	}
	@Override
	public int compareTo(Employee4 o2) // -ve OR Zero OR +ve
	{
	     
		return (this.salary - o2.salary); // -ve
	}
}


public class Drivar4 {

	public static void main(String[] args) {
	
		// this is insaction order
		Employee4 e1 = new Employee4 (120000, "rohit");
		Employee4 e2 = new Employee4 (90000, "shubham");
		
		Employee4 e3 = new Employee4 (130000, "ajhar");
		Employee4 e4 = new Employee4 (40000, "someone");
		
		// are thes compareable ? no
		
		TreeSet<Employee4> ts = new TreeSet <Employee4>(); // will do sorting
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println(ts);
		for(Employee4 e33 : ts)
		{
			System.out.println(e33.name  +" and "+ e33.salary);
		}

		
	}

}