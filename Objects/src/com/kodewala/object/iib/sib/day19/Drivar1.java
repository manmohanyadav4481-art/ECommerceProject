package com.kodewala.object.iib.sib.day19;


class Employeee {
	
	static int counter =0;
	String name;
	String empid;
	
	{
		counter = counter +1;
	}
	{
		System.out.println("Employee.enclosing_method()1");
	}
	{
		System.out.println("Employee.enclosing_method()2");
	}
	
	public Employeee (String _name, String _company) {
		// super or this 
		// iib
		this.name = _name;
		this.empid = _company +"_"+counter;
	}
}

public class Drivar1 {

	public static void main(String[] args) {
	
		Employeee e = new Employeee ("Rahul", "Infosys");
		System.out.println(e.name + "_"+ e.empid);

	}

}