package com.amazon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.amazon.payment.Payment;

@Configuration
@ComponentScan (basePackages = "com.amazon")
public class SpringConfig {

	@Bean("upi")
	@Primary
	public Payment upi()
	{
		return new Payment("REF-UPI-1132");
	}
	
	@Bean("card")
	public Payment card()
	{
		return new Payment("REF-CARD-123432");
	}
}
