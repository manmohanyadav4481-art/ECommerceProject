package com.amazon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.address.Address;
import com.amazon.emp.Employee;

@Configuration
public class SpringConfig {

	@Bean("emp1")
	public Address address() 
	{
		Address address = new Address("28th Main", "17th cross", "BLR", "Karnataka");
		return address;
	}
	
	@Bean ("emp2")
	public Employee employee (Address address)
	{
		Employee employee = new Employee(120000, "Manmohan", address); //address is mandatory
		return employee;
		
	}
}
