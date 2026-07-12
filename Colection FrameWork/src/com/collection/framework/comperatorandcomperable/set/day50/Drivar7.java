package com.collection.framework.comperatorandcomperable.set.day50;


import java.util.TreeSet;
// compare employee / you make they class extends campareable
class Employee7 implements Comparable<Employee7>
{
	int salary;
	String name;
	public Employee7 (int _salary , String _name) 
	{
	
		super();
		this.salary = _salary;
		this.name = _name;
	}
	// override the method / perfom the logic 
	@Override
	public int compareTo(Employee7 o2) // -ve OR Zero OR +ve
	{
		//campareing equals methods string / if have integer just do the culculator
	     
		return (o2.name.compareTo(this.name)); // zero / this return positive and negative
	}
}


public class Drivar7 {

	public static void main(String[] args) {
	
		// this is insaction order
		Employee7 e1 = new Employee7 (120000, "rohit"); 
		Employee7 e2 = new Employee7 (120000, "shubham");
		
		Employee7 e3 = new Employee7 (130000, "ajhar");
		Employee7 e4 = new Employee7 (40000, "someone");
		
		// are thes compareable ? no
		// this is internal do the comparesing/ and fund th interna object compareable
		// formormance sorting this logic
		TreeSet<Employee7> ts = new TreeSet <Employee7>(); // will do sorting
		// then you adding this
		ts.add(e1);
		ts.add(e2);
	
		ts.add(e3);
		ts.add(e4);
		
		System.out.println(ts);
		
		// give the output
		for(Employee7 e33 : ts)
		{
			System.out.println(e33.name  +" and "+ e33.salary);
		}

		
	}
	// how does identityfy duplicate
// this is identitefy duplicate samthing is returning zero
}