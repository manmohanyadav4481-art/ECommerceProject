package com.kodewala.object.iib.sib.day19;

class Employee {
	
	static int counter =0;
	String name;
	String empid;
	
	{
		counter = counter +1;
	}
	{
		System.out.println("Employee.enclosing_method()");
	}
	{
		counter = counter +1;
	}
	
	public Employee (String _name, String _company) {
		
		this.name = _name;
		this.empid = _company +"_"+counter;
	}
}

public class Drivar {

	public static void main(String[] args) {
	
		Employee e = new Employee ("Rahul", "Infosys");
		System.out.println(e.name + "_"+ e.empid);

	}

}
