package com.kodewala.day61;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;





class BankAccount5 {
	
	private int balance =1000;
	
	ReentrantLock reentrantLock = new ReentrantLock();
	
	// 1000 lines 
	
	public  void withdraw (int amount) throws InterruptedException {  
		
		System.out.println( Thread.currentThread().getName()+"some other logic .... 50 lines "); 
		
		
		
		//reentrantLock.tryLock(2000, TimeUnit.MILLISECONDS);  // sync started --->t1
		reentrantLock.lock();
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

class Customer5 extends Thread {
	private BankAccount5 account;
	
	public Customer5 (BankAccount5 account, String name) {
		
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
public class RaceConditionDemo5 {

	public static void main(String[] args) throws Exception {
	
		BankAccount5 account = new BankAccount5 ();  // shared account belongs to raunak
		
		System.out.println(" Raunak's  Init Balance  = "+account.getBalance());
		
		Customer5 t1 = new Customer5 (account, "Raunak is doing PhonePay");
		Customer5  t2 = new Customer5 (account, "Raunak is Brother is doing GPay");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Balance  = "+account.getBalance());

	}

}