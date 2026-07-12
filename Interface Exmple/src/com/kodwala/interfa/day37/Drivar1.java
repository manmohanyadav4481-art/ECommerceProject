package com.kodwala.interfa.day37;

class Account  {

	int balance;
	String accountNo;
	String atmPin;
	
	public Account (int balance, String accountN0,String atmPin) {
		super();
		this.balance = balance;
		this.accountNo = accountN0;
		this.atmPin = atmPin;
	}
}
class DataProcessor {
	public void printDetails(Object obj) {
		if(obj instanceof DataPrintable)
		{
			Account acc = (Account)obj;
			System.out.println("account : "+acc.accountNo);
			System.out.println("atm pin : "+acc.atmPin);
			System.out.println("balance : "+acc.balance);

		}else
		{
			System.out.println("DataPrintException..");
		}
	
	}
}

public class Drivar1 {

	public static void main (String[]args) {
		Account acc = new Account (123213, "123445", "1231");
		
		DataProcessor dat =new DataProcessor();
		dat.printDetails(acc);
	}
	
}