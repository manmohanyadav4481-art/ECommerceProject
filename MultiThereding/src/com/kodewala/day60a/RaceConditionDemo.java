package com.kodewala.day60a;


class BankAccount {
	
	private int balance =1000;
	
	public  void withdraw (int amount) {
		
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

class Customer extends Thread {
	private BankAccount account;
	
	public Customer (BankAccount account, String name) {
		
		super (name);
		this.account =account;
		
	}
	@Override
	public void run()
	{
		account.withdraw(800);
	}
}
public class RaceConditionDemo {

	public static void main(String[] args) throws InterruptedException {
	
		BankAccount account = new BankAccount ();
		
		Thread t1 = new Customer (account, "User-1");
		Thread t2 = new Customer (account, "User-2");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Balance  = "+account.getBalance());

	}

}
// check chengeable output