package com.kodewala.day61;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;





class BankAccount {
	
	private static int balance =1000;
	
	
	// 1000 lines 
	
	public static void withdraw (int amount) {  
		
		System.out.println( Thread.currentThread().getName()+"some other logic .... 50 lines "); 
		
		ReentrantLock reentrantLock = new ReentrantLock();
		
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

class Customer extends Thread {
	private BankAccount account;
	
	public Customer (BankAccount account, String name) {
		
		super (name);
		this.account =account;
		
	}
	@Override
	public void run()
	{
		BankAccount.withdraw(800);
	}

}
public class RaceConditionDemo {

	public static void main(String[] args) throws Exception {
	
		BankAccount account = new BankAccount ();  // shared account belongs to raunak
		
		System.out.println(" Raunak's  Init Balance  = "+account.getBalance());
		
		Customer t1 = new Customer (account, "Raunak is doing PhonePay");
		Customer  t2 = new Customer (account, "Raunak is Brother is doing GPay");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Balance  = "+account.getBalance());

	}

}
//  check changenable output