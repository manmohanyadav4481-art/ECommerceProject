package com.kodwala.interfa;

interface BankMgmt {
	
	public void creatAccount ();
	public void modifiyAccount ();
	public void suspendAccount ();
	public void deliteAccount ();
	
	default void doKYC () {
		System.out.println("BankMgmt.doKYC()");
	}
	public static void billRecipt () {
		System.out.println("BankMgmt.billRecipt()");
	}
}
class SBI implements BankMgmt {

	@Override
	public void creatAccount() {
		System.out.println("SBI.creatAccount()");
		
	}

	@Override
	public void modifiyAccount() {
	System.out.println("SBI.modifiyAccount()");
		
	}

	@Override
	public void suspendAccount() {
		System.out.println("SBI.suspendAccount()");
		
	}

	@Override
	public void deliteAccount() {
		System.out.println("SBI.deliteAccount()");
	}
	
}
class HDFC implements BankMgmt {

	@Override
	public void creatAccount() {
		System.out.println("HDFC.creatAccount()");
		
	}

	@Override
	public void modifiyAccount() {
		System.out.println("HDFC.modifiyAccount()");
		
	}

	@Override
	public void suspendAccount() {
		System.out.println("HDFC.suspendAccount()");
		
	}

	@Override
	public void deliteAccount() {
		System.out.println("HDFC.deliteAccount()");
		
	}
	public void doKYC () {
		System.out.println("HDFC.doKYC()");
		ReciptPDF();
	}
	private void ReciptPDF () {
		System.out.println("HDFC.ReciptPDF()");
		BankMgmt.billRecipt();
	}
	
}
public class Account {
	public static void main (String [] args) {
		BankMgmt ba = new HDFC ();
		ba.creatAccount();
		ba.modifiyAccount();
		ba.deliteAccount();
		ba.suspendAccount();
		ba.doKYC();
	}
}