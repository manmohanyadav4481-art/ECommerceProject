package com.kodewala.day61;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;





class BankAccount0 {
	
	private int balance =1000;
	
	ReentrantLock reentrantLock = new ReentrantLock();
	
	// 1000 lines 
	
	public  void withdraw (int amount) {  
		
		System.out.println( Thread.currentThread().getName()+"some other logic .... 50 lines "); 
		
		
		
		reentrantLock.lock();  // sync started 
		
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
		reentrantLock.unlock();
}

	public int getBalance () {
		return balance;
	}
}

class Customer0 extends Thread {
	
	private BankAccount0 account;
	
	public Customer0 (BankAccount0 account, String name) {
		
		super (name);
		this.account =account;
		
	}
	@Override
	public void run()
	{
		account.withdraw(800);
	}

}
public class RaceConditionDemo0 {

	public static void main(String[] args) throws Exception {
	
		BankAccount0 account = new BankAccount0 ();  // shared account belongs to raunak
		
		System.out.println(" Raunak's  Init Balance  = "+account.getBalance());
		
		Customer0 t1 = new Customer0 (account, "Raunak is doing PhonePay");
		Customer0  t2 = new Customer0 (account, "Raunak is Brother is doing GPay");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Balance  = "+account.getBalance());

	}

}