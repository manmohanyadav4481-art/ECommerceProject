package com.amazon.account.config;

import org.springframework.context.annotation.Bean;

import com.amazon.account.beans.Account;

public class SpringConfig {
	

	@Bean("pay")
	public Account account ()
	{
		Account account = new Account();
		
		account.setSetAccountNumber("344556");
		account.setSetifscCode("Sbi445");
		account.setSetAccHolderName("man");
		return account;
		
		
	}
	
	@Bean
	public Account account2 ()
	{
		Account account1 = new Account();
		
		account1.setSetAccountNumber("34435356");
		account1.setSetifscCode("Sbi44");
		account1.setSetAccHolderName("manmoahan");
		return account1;
	
}
}