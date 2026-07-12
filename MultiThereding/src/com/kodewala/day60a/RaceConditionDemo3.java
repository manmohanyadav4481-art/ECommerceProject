package com.kodewala.day60a;


class BankAccount3 {
	
	private int balance =1000;
	
	public synchronized void withdraw (int amount) {
		
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() +" is withdrawing "+amount);
			
			//simulate delay
			
			try {
				 Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			balance = balance - amount ;
			System.out.println(Thread.currentThread().getName() +" Completed withdrawal. balance = "+balance);
		}else {
			System.out.println(Thread.currentThread().getName()  +" Insufficient Balance ");
		
	}
}

	public int getBalance () {
		return balance;
	}
}

class Customer3 extends Thread {
	private BankAccount3 account;
	
	public Customer3 (BankAccount3 account, String name) {
		
		super (name);
		this.account =account;
		
	}
	@Override
	public void run()
	{
		account.withdraw(800);
	}
}
public class RaceConditionDemo3 {

	public static void main(String[] args) throws Exception {
	
		BankAccount3 account = new BankAccount3 ();  // shared account belongs to raunak
		
		System.out.println("Init Balance  = "+account.getBalance());
		
		Customer3 t1 = new Customer3 (account, "PhonePay");
		Customer3  t2 = new Customer3 (account, "GPay");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Balance  = "+account.getBalance());

	}

}
// check chengenable output