package com.Arraylist.Revision;

public class HDFCuser {

	private String name;
	private String branchName;
	private String bankName;
	private int balance;
	
	public HDFCuser(String name, String branchName, String bankName, int balance) {
		super();
		this.name = name;
		this.branchName = branchName;
		this.bankName = bankName;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
