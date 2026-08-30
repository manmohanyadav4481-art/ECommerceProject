package com.amazon.account.Config;

import org.springframework.context.annotation.Bean;

import com.amazon.account.beans.Account;

public class SpringConfig {
	
	@Bean ("acc1")
	public Account createAccounte1 () {
		
		Account account = new Account();
		
		account.setAccountHolderName("Batch, 9th march");
		account.setAccountNumber("32445");
		account.setIfsccode("IDF43");
		
		return account;	
	}
	@Bean
	public Account createAccount2 () {
		
		Account account = new Account();
		
		account.setAccountHolderName("Batch. 9th march");
		account.setAccountNumber("2342");
		account.setIfsccode("Asix454");
		return account;
	}
	

}
