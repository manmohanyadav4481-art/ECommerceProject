package com.collection.framework.comperatorandcomperable.set.day50;


import java.util.TreeSet;
// compare employee / you make they class extends campareable
class Employee8 implements Comparable<Employee8>
{
	int salary;
	String name;
	public Employee8 (int _salary , String _name) 
	{
	
		super();
		this.salary = _salary;
		this.name = _name;
	}
	// override the method / perfom the logic 
	// you need to campare both name and salary / modify
	@Override
	public int compareTo(Employee8 o2) // -ve OR Zero OR +ve
	{
		//campareing equals methods string / if have integer just do the culculator
	     
		return (o2.name.compareTo(this.name)); // zero / this return positive and negative
	}
}


public class Drivar8 {

	public static void main(String[] args) {
	
		// this is insaction order
		Employee8 e1 = new Employee8 (120000, "rohit"); 
		Employee8 e2 = new Employee8 (120000, "rohit");
		
		Employee8 e3 = new Employee8 (130000, "ajhar");
		Employee8 e4 = new Employee8 (40000, "someone");
		
		// are thes compareable ? no
		// this is internal do the comparesing/ and fund th interna object compareable
		// formormance sorting this logic
		TreeSet<Employee8> ts = new TreeSet <Employee8>(); // will do sorting
		// then you adding this
		ts.add(e1);
		ts.add(e2);
	
		ts.add(e3);
		ts.add(e4);
		
		System.out.println(ts);
		
		// give the output
		for(Employee8 e33 : ts)
		{
			System.out.println(e33.name  +" and "+ e33.salary);
		}

		
	}
	// how does identityfy duplicate
// this is identitefy duplicate samthing is returning zero
}
// name duplecate is not there
