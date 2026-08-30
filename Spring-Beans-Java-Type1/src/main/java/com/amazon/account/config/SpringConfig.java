package com.amazon.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.account.beans.Account;

@Configuration  // this @Configuration tell that this class is source of bean dfinition
public class SpringConfig {

// how do we define the bean?
	@Bean ("acc1")
	public Account createAccount1 () {
		
		Account account = new Account();
		
		account.setAccountHolderName("Batch, 9th March");
		account.setAccountNumber("234455433553");
		account.setIfscCode("SBIN8767657");
		
		return account;
	}
	@Bean ("acc2")
	public Account createAccount2 () {
		
		Account account = new Account();
		
		account.setAccountHolderName("Batch, 9th March");
		account.setAccountNumber("5433553");
		account.setIfscCode("ICIc767657");
		
		return account;
	}
	
	
}
