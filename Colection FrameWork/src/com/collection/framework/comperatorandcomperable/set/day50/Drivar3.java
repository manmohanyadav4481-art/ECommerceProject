package com.collection.framework.comperatorandcomperable.set.day50;


import java.util.TreeSet;

class Employee3 implements Comparable<Employee3>
{
	int salary;
	String name;
	public Employee3 (int _salary , String _name) 
	{
	
		super();
		this.salary = _salary;
		this.name = _name;
	}
	@Override
	public int compareTo(Employee3 o) // -ve OR Zero OR +ve
	{
	     
		return (this.salary - o.salary); // -ve
	}
}


public class Drivar3 {

	public static void main(String[] args) {
	
		Employee3 e1 = new Employee3 (120000, "rohit");
		Employee3 e2 = new Employee3 (9000, "shubham");
		
		// are thes compareable ? no
		
		TreeSet<Employee3> ts = new TreeSet <Employee3>(); // will do sorting
		
		ts.add(e1);
		ts.add(e2);
		
		//System.out.println(ts);
		for(Employee3 e33 : ts)
		{
			System.out.println(e33.name  +" and "+ e33.salary);
		}

		// is saying cannot to be campareable
	}

}