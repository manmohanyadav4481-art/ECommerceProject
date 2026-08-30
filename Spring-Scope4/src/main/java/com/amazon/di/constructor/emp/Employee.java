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
		System.out.println(" 1 .Employee.Employee() - constructor ");
		this.salary = salary;
		this.name = name;
		
	}
	
	public void setAddress (Address _addAddress) {
		
		System.out.println(" 2. Employee.setAddress() - Dependecny Injection ");
		this.address = _addAddress;
	}
	
	public void printInfo () {
		System.out.println(" 4. Employee.printInfo() - doing work ");
		address.displayInfo();
	}
	@PostConstruct
	public void init ()
	{
		System.out.println("3 . Employee.init() - init");
	}
	@PreDestroy
	public void cleanup() 
	{
		
		System.out.println(" 5. Employee.cleanup() - doing clean up before destroy . ");
	}
}