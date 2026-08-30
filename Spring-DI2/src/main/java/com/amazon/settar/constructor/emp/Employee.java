package com.amazon.settar.constructor.emp;

import com.amazon.settar.address.Address;

public class Employee {

	private int salary;
	private String name;
	
	
	private Address address;

// we are passing dependancies using constructor.(Immutable)
	public Employee(int salary, String name, Address address) {
		super();
		this.salary = salary;
		this.name = name;
		this.address = address;
	}
	
	public void printInfo() 
	{
       address.displayAddressInfo();
	}
	
}