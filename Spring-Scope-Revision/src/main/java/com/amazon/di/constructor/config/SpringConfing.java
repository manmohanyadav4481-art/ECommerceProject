package com.amazon.di.constructor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.amazon.di.constructor.address.Address;
import com.amazon.di.constructor.emp.Employee;
import com.amazon.di.constructor.payment.Payment;

@Configuration
public class SpringConfing {

	@Bean("pay")

	public Address address ()
	{
		Address address = new Address("12 main", "cross road", "bangalore", "karnataka");
		return address;
		
		
		
	}
	
	@Bean("pay1")
	public Employee employee (Address address)
	{
		Employee employee = new Employee(12000,  "man");
		employee.setAddress(address);
		return employee;
		
	}
}
