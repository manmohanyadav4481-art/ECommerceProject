package com.programe.oops.settargettar.Encap;



class Accountpvt {
private	int balance = 1000;
	
	//Set-Tar
	public void deposit (int amount) {
		if(amount>0)
		balance = balance + amount;
	}
	
	//Get-Tar
	public int getBalance () {
		return balance;
	}
	
		
	
}
public class Main {
	public static void main (String [] args) {
	Accountpvt a = new Accountpvt ();
	a.deposit(23);
	System.out.println(a.getBalance());

}
}