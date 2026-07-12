package com.kodewala.objects0.day14;

class Account2 
{
	int balance;
	String accountHolder;
	// first object call constructor
	Account2 (int _balance, String _accountHolder)  // parametar pass
	{  
		// assign 1200 and kodewala
		balance = _balance;
		accountHolder = _accountHolder;
	}
}

public class Drivar7 {

	public static void main(String[] args) {
        // creating new object in heap
		// whenever acc object create here in heap  balance and accountHolde this is the another
		// objcet creat ing heap
		Account2 acc = new Account2 (1200 , "Kodewala");
		System.out.println(acc.balance);
		System.out.println(acc.accountHolder);

	}

}
