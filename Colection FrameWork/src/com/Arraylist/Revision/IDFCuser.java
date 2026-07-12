package com.Arraylist.Revision;

public class IDFCuser {

	private String name;
	private String branchName;
	private String ifsccode;
	private int balance;
	
	public IDFCuser(String name, String branchName, String ifsccode, int balance) {
		super();
		this.name = name;
		this.branchName = branchName;
		this.ifsccode = ifsccode;
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

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
}
