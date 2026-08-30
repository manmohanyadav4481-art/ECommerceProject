package com.amazon.account.config;

import org.springframework.context.annotation.Bean;

import com.amazon.account.beans.Account;

public class SpringConfig {

	@Bean("acc1")
	public Account  createAccount1() {
		
		Account account = new Account();
		
		account.setAccountHolderName("Batch, 9th June");
		account.setAccountNumber("234422");
		account.setIfsccode("Ubids34");
		
		return account;
		
	}
	@Bean
	public Account createAccount2 () {
		
		Account account = new Account();
		account.setAccountHolderName("Batch, 9th march");
		account.setAccountNumber("123444");
		account.setIfsccode("secddd12");
		
		return account;
		
		
	}
	
	
}
