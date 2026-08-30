package com.amazon.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.account.beans.Account;

@Configuration  // this @Configuration tell that this class is source of bean dfinition
public class SpringConfig {

// how do we define the bean?
	@Bean ("acc1")
	public Account createAccount () {
		
		Account account = new Account();
		
		account.setAccountHolderName("Batch, 9th March");
		account.setAccountNumber("234455433553");
		account.setIfscCode("SBIN8767657");
		
		return account;
	}
}
