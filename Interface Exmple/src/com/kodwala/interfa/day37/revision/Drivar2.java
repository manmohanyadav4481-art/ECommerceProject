package com.kodwala.interfa.day37.revision;

class Bank implements BankPayable {
	String accHolderName;
	int accountNum;
	double balance;
	//contractor
	Bank(String accHolderName, int accountNum, double balance){
		super();
		this.accHolderName = accHolderName;
		this.accountNum = accountNum;
		this.balance = balance;
	}
	//Inner class
	class PaymentProccessor {
		public void paymentDetails (Object obj) {
			if (obj instanceof BankPayable ) {
			Bank ba = (Bank)obj;//upcasting
			System.out.println("AccountHolderName : "+ba.accHolderName);
			System.out.println("AccountNumber : "+ba.accountNum);
			System.out.println("TotalBalance : "+ba.balance);
			}else {
				System.out.println("Print of Student Exception");
			}
		}
	}
}
//Separate main class
public class Drivar2{
	public static void main (String []args) {
		Bank b = new Bank ("ManMohan Singh Yadav", 220361020, 5000.6);
		
		Bank.PaymentProccessor  pa = b.new PaymentProccessor();
		pa.paymentDetails(b);
}
}