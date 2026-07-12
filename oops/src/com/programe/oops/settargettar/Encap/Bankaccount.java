package com.programe.oops.settargettar.Encap;

 class Account {
	int balance = 1000;// Data
	
	//Set-tar
	public void deposit (int amount) {
	if(amount>0)
		balance = balance + amount;
	
	}
	//void display Get-tar
	public int getBalance () {
		return balance;
		
	}

}

class Bankaccount {
	public static void main (String [] args) {
		Account a = new Account () ;
		a.deposit(1200);
		System.out.println(a.getBalance());
			}


		}

