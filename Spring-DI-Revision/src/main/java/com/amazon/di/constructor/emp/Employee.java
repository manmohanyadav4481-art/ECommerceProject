package com.amazon.di.constructor.emp;



import org.springframework.beans.factory.annotation.Autowired;

import com.amazon.di.constructor.address.Address;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Employee {

	private int salary;
	private String name;
	
	
	
	@Autowired
	private Address address;
	
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
		
	}
	
	
	
	public void print ()
	{
		address.displayInfo();
	}
	
	
	

}
