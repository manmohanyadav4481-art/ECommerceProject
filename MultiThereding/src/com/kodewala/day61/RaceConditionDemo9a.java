package com.kodewala.day61;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;





class BankAccount9a {
	
	private int balance =1000;
	
	ReentrantLock reentrantLock = new ReentrantLock();
	
	// 1000 lines 
	
	public  void withdraw (int amount) throws InterruptedException {  
		
		System.out.println( Thread.currentThread().getName()+"some other logic .... 50 lines "); 
		
		
		
		boolean lockStatus =  reentrantLock.tryLock(2000, TimeUnit.MILLISECONDS);  // sync started --->t1
		
		System.out.println("BankAccount.Withdraw "+lockStatus);
		
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

class Customer9a extends Thread {
	private BankAccount9a account;
	
	public Customer9a (BankAccount9a account, String name) {
		
		super (name);
		this.account =account;
		
	}
	@Override
	public void run()
	{
		try {
			Thread.sleep(5000);  // it will release the lock and moves to waiting state  // not holding the lock
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}

}
public class RaceConditionDemo9a {

	public static void main(String[] args) throws Exception {
	
		BankAccount9a account = new BankAccount9a ();  // shared account belongs to raunak
		
		System.out.println(" Raunak's  Init Balance  = "+account.getBalance());
		
		Customer9a t1 = new Customer9a (account, "Raunak is doing PhonePay");
		Customer9a  t2 = new Customer9a (account, "Raunak is Brother is doing GPay");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Balance  = "+account.getBalance());

	}

}
