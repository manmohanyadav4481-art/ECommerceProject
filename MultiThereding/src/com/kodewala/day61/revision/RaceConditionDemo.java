package com.kodewala.day61.revision;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class Bank {
	private int balance =1000;
    
	public  void withdraw (int amount) {
		
		synchronized (Bank.class) {
			
		}
		
		if(balance >=amount)
		{
			System.out.println( Thread.currentThread().getName()+ "is withdraw : "+amount);
		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			balance = balance - amount;
			System.out.println("Complete withdraw and remain balance : "+balance);
		}else {
			System.out.println(Thread.currentThread().getName()+ "Insufficent balance ");
		}
	}
		public int getBalance () {
			return balance;
		}
	}
	
class Customer extends Thread
{
	private Bank account;

	public Customer(Bank account, String name) {
		super(name);
		this.account = account;
	}
	@Override
	public void run () {
		account.withdraw(700);
	}
	
}

public class RaceConditionDemo {

	public static void main(String[] args) throws Exception {
	
		Bank acc = new Bank ();
	
		
		
		Thread c = new Customer (acc, "Ram is useing CRID..");
		Thread c1 = new Customer (acc, "Raj is useing Slice ");
		
		c.start();
		c1.start();
	/*	
		c.join();
		c1.join();
		*/
		System.out.println("final amount : " +acc.getBalance());
		
	
	}

}
