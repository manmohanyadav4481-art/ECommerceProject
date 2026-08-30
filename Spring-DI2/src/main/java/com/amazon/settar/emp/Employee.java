package com.amazon.settar.emp;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazon.settar.address.Address;

public class Employee {

	private int salary;
	private String name;
	
	@Autowired
	private Address address;


	public Employee(int salary, String name ) {
		super();
		this.salary = salary;
		this.name = name;
		
	}

	public void printInfo() 
	{
       address.displayAddressInfo();
	}
	
}