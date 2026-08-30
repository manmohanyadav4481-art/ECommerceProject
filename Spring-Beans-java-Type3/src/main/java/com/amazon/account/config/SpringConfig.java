package com.amazon.account.config;

import org.springframework.context.annotation.Bean;

import com.amazon.account.beans.Account;

public class SpringConfig {

	
	// How do difine beans
	@Bean ("acc1")
	public Account createAccount1 () {
		
		Account account = new Account();
		
		account.setAccountHolderName("Batch, 9th march");
		account.setAccountNumber("343553");
		account.setIfscCode("unity232");
		
		
		return account;
		
		
	}
	
	@Bean
	public Account createAccount2 () {
		
		Account account = new Account();
		
		account.setAccountHolderName("Batch. 9th June");
		account.setAccountNumber("2344223");
		account.setIfscCode("HDFc433");
		return account;
		
		
	}
	
	
}
