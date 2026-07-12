package com.kodwala.interf.acc;

interface IAccountMgmt {

	//class-->(what + How )----abstract class --->what/ (what+how)--->interface-->what(100)
	
	public void createAccount ();//what
	public void modifyAccount ();
	public void suspendAccount ();
	public void deleteAccount ();
}
class RetailUser implements IAccountMgmt {

	@Override
	public void createAccount() {//how
		System.out.println("RetailUser.createAccount()");
		
	}

	@Override
	public void modifyAccount() {
		System.out.println("RetailUser.modifyAccount()");
		
	}

	@Override
	public void suspendAccount() {
		System.out.println("RetailUser.suspendAccount()");
		
	}

	@Override
	public void deleteAccount() {
		System.out.println("RetailUser.deleteAccount()");
		
	}
	
}
