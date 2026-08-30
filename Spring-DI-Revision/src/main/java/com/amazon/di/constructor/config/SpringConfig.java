package com.amazon.di.constructor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.di.constructor.address.Address;
import com.amazon.di.constructor.emp.Employee;

@Configuration
public class SpringConfig {

	@Bean("emp1")
	public Address address ()
	{
		Address address = new Address("12th main", "cross road", "Bangalore", "karnataka");
		return address;
		
	}
	
	@Bean("emp2")
	public Employee employee (Address address)
	{
		Employee employee = new Employee(1234444, "man");
		
		return employee;
		
	}
	
	
}