package com.amazon.account.config;

import org.springframework.context.annotation.Bean;

import com.amazon.account.beans.Account;

public class SpringConfig {

	// How do difine Beans 
	
	@Bean ("acc1")
	public Account createAccount1 () {
		
		Account account = new Account();
		
		account.setAccountHolderName("Batch, 9th March");
		account.setAccountNumber("3432455");
		account.setIfscCode("Unityb2322");
		
		return account;
		}
	
	@Bean ()
	public Account createAccount2 () {
		
		Account account = new Account();
		
		account.setAccountHolderName("Batch, 9th March");
		account.setAccountNumber("54356");
		account.setIfscCode("UBI4544");
		return account;
	}
}
