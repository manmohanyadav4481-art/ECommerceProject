package com.programe.oops.inheritance.day23;

class AccountMgmtt  // parent of Account class 
{
	String ifscCode = "SBIN000";
	
	public void doFundTransferr ()
	{
		System.out.println("AccountMgmt.doFundTransfer() ..500 lines "); // 15 day
	}

}
class Accountt extends AccountMgmtt  // Account class is child of Accountmgmt 
{
	public void pay()
	{
		Accountt a = new Accountt();
		System.out.println(a.ifscCode); // re-using the parent class attributes in child class 
		a.doFundTransferr(); // we are re-using parent class method
	}
}

public class Drivar2 {

	public static void main(String[] args) {

  Accountt a = new Accountt ();
  a.doFundTransferr();
  a.pay();

	}

}