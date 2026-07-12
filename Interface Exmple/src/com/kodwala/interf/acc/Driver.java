package com.kodwala.interf.acc;

public class Driver {

	public static void main(String[] args) {
IAccountMgmt ia = new RetailUser ();
ia.createAccount();
ia.deleteAccount();
ia.modifyAccount();
ia.suspendAccount();

	}

}
