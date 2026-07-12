package com.Arraylist.Revision;



public class UBIUser {
	
	private String Name;
	private String IFScode;
	private String Address;
	private int balance;
	
	public UBIUser(String name, String iFScode, String address, int balance) {
		super();
		Name = name;
		IFScode = iFScode;
		Address = address;
		this.balance = balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getIFScode() {
		return IFScode;
	}

	public void setIFScode(String iFScode) {
		IFScode = iFScode;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
