package com.kodwala.interfa.day37;



class Accountt implements  DataPrintable {

	int balance;
	String accountNo;
	String atmPin;
	
	public Accountt (int balance, String accountN0,String atmPin) {
		super();
		this.balance = balance;
		this.accountNo = accountN0;
		this.atmPin = atmPin;
	}
}
class DataProcessorr {
	public void printDetails(Object obj) {
		if(obj instanceof DataPrintable)
		{
			Accountt acc = (Accountt)obj;
			System.out.println("account : "+acc.accountNo);
			System.out.println("atm pin : "+acc.atmPin);
			System.out.println("balance : "+acc.balance);

		}else
		{
			System.out.println("DataPrintException..");
		}
	
	}
}

public class Drivar2 {
	
	public static void main (String[]args) {
		Accountt acc = new Accountt (123213, "123445", "1231");
		
		DataProcessorr dat =new DataProcessorr();
		dat.printDetails(acc);
	}
	
}
