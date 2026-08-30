package com.amazon.di.constructor.emp;

import com.amazon.di.constructor.address.Address;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Employee {

	private int salary;
	private String name;
	
	
	
	
	private Address address;
	
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	
	
	public void setAddress (Address  _address)
	{
		System.out.println("Employee.setAddress()...Dependancy injuction");
		this.address = _address;
	}
	
	public void print ()
	{
		System.out.println("Employee.print().....doing work");
	
		address.displayInfo();
	}
	
	@PostConstruct
	public void inite () 
	{
		System.out.println("Employee.inite()....inite ");
	}
	
	@PreDestroy
	public void cleanup ()
	{
		System.out.println("Employee.cleanup() is doing cleanup");
	}
	
}