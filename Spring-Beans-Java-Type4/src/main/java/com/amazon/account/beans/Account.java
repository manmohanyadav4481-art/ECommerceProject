package com.amazon.account.beans;

public class Account {
	
	private String accountHolderName;
	private String ifsccode;
	private String accountNumber;
	
	public String getaccountHolderName () {
		return accountHolderName;
		
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void displayInfo() {
		System.out.println("Account [accountHolderName=" + accountHolderName + ", ifsccode=" + ifsccode + ", accountNumber="
				+ accountNumber + "]");
	}

}
