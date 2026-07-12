package com.collection.framework.compreableandcomperator.Set.day50;

import java.util.TreeSet;

public class Drivar {

	public static void main(String[] args) {
		
		Employee e1 = new Employee ("rohit", "bhishkar");
		Employee e2 = new Employee ("Shubham", "mahajan");
		Employee e3 = new Employee ("sahil", "ansari");
		

		TreeSet<Employee> ts = new TreeSet<Employee>(new FirstNameComperator());
	
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		for(Employee e : ts)
		{
			System.out.println(e.firstName +" and "+e.lastName);
		}
	}

}
