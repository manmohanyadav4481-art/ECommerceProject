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
	Address address2 = new Address("12th main", "13th cross ", "BLR", "KTK");
	return address2;
}
	
	@Bean ("emp3")
	public Employee employee (Address address) 
	{
		Employee employee = new Employee(120000, "man");
		
		employee.setAddress(address);
		return employee;
		
	}
}