package com.kodewala.day60a;


class BankAccount8 {
	
	private int balance =1000;
	
	
	// 1000 lines 
	
	public  void withdraw (int amount) {  // only one Thread will be able to execute the method.
		
		System.out.println( Thread.currentThread().getName()+"some other logic .... 50 lines "); // slow down the performance
		
		synchronized (this)   // only one Thread will be able to execute this block. 
		{
			
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
}

	public int getBalance () {
		return balance;
	}
}

class Customer8 extends Thread {
	private BankAccount8 account;
	
	public Customer8 (BankAccount8 account, String name) {
		
		super (name);
		this.account =account;
		
	}
	@Override
	public void run()
	{
		account.withdraw(800);
	}

}
public class RaceConditionDemo8 {

	public static void main(String[] args) throws Exception {
	
		BankAccount8 account = new BankAccount8 ();  // shared account belongs to raunak
		
		System.out.println(" Raunak's  Init Balance  = "+account.getBalance());
		
		Customer8 t1 = new Customer8 (account, "Raunak is doing PhonePay");
		Customer8  t2 = new Customer8 (account, "Raunak is Brother is doing GPay");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Balance  = "+account.getBalance());

	}

}
//  check changenable output