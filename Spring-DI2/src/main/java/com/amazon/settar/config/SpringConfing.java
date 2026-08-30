package com.amazon.settar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.settar.address.Address;
import com.amazon.settar.emp.Employee;



@Configuration
public class SpringConfing {

	@Bean
	public Address address() // if you not diclear the class address you are not geting address
	{
		Address address = new Address("28th Main", "17th cross", "BLR", "Karnataka");
		return address;
	}
	
	@Bean ("emp2")
	public Employee employee (Address address)
	{
		Employee employee = new Employee(120000, "Manmohan"); 
		
		
		return employee;
		
	}
}