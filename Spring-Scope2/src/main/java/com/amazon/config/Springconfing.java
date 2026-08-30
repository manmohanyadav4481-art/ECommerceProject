package com.amazon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.amazon.bean.Payment;

@Configuration
public class Springconfing {

	@Bean("sam1")
	@Scope("prototype")
	public Payment payment ()
	{
		Payment payment = new Payment();
		
		payment.setRefId("2334");
		return payment;
		
	}
}
