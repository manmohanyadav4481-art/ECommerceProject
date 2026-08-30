package com.amazon.di.setter.emp;

import com.amazon.di.constructor.address.*;

public class Employee {

	private int salary;
	private String name;
	
	
	private com.amazon.di.settar.address.Address address;


	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
		
	}

	public void setAddress (com.amazon.di.settar.address.Address _address)
	{
		this.address = _address;
	}
	
	public void printInfo() 
	{
       address.displayAddressInfo();
	}
	
}
