package com.kodewala.day60a;


class BankAccount1 {
	
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

class Customer1 extends Thread {
	private BankAccount1 account;
	
	public Customer1 (BankAccount1 account, String name) {
		
		super (name);
		this.account =account;
		
	}
	@Override
	public void run()
	{
		account.withdraw(800);
	}
}
public class RaceConditionDemo1 {

	public static void main(String[] args) throws InterruptedException {
	
		BankAccount1 account = new BankAccount1 ();  // shared account belongs to raunak
		
		Thread t1 = new Customer1 (account, "User-1");
		Thread t2 = new Customer1 (account, "User-2");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Balance  = "+account.getBalance());

	}

}
// check chengeabel output