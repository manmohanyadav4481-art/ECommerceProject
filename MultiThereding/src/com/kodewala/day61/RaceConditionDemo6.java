package com.kodewala.day61;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount6 {
	
	private int balance = 1000;
	
	ReentrantLock reentrantLock = new ReentrantLock();
	
	// 1000 lines 
	
	public  void withdraw (int amount) throws InterruptedException {  
		
		System.out.println( Thread.currentThread().getName()+"some other logic .... 50 lines "); 
		
		
		
		reentrantLock.tryLock(2000, TimeUnit.MILLISECONDS);  // sync started --->t1
		//reentrantLock.lock();
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
		//reentrantLock.unlock();
}

	public int getBalance () {
		return balance;
	}
}

class Customer6 extends Thread {
	private BankAccount6 account;
	
	public Customer6 (BankAccount6 account, String name) {
		
		super (name);
		this.account =account;
		
	}
	@Override
	public void run()
	{
		try {
			account.withdraw(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
public class RaceConditionDemo6 {

	public static void main(String[] args) throws Exception {
	
		BankAccount6 account = new BankAccount6 ();  // shared account belongs to raunak
		
		System.out.println(" Raunak's  Init Balance  = "+account.getBalance());
		
		Customer6 t1 = new Customer6 (account, "Raunak is doing PhonePay");
		Customer6  t2 = new Customer6 (account, "Raunak is Brother is doing GPay");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Balance  = "+account.getBalance());

	}

}