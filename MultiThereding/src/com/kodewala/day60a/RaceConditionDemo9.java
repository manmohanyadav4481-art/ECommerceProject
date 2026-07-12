package com.kodewala.day60a;


class BankAccount9 {
	
	private static int balance =1000;
	
	
	// 1000 lines 
	
	public static void withdraw (int amount) {  // only one Thread will be able to execute the method.
		
		System.out.println( Thread.currentThread().getName()+"some other logic .... 50 lines "); // slow down the performance
		
		synchronized (BankAccount.class)   // only one Thread will be able to execute this block. 
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

class Customer9 extends Thread {
	private BankAccount9 account;
	
	public Customer9 (BankAccount9 account, String name) {
		
		super (name);
		this.account =account;
		
	}
	@Override
	public void run()
	{
		BankAccount9.withdraw(800);
	}

}
public class RaceConditionDemo9 {

	public static void main(String[] args) throws Exception {
	
		BankAccount9 account = new BankAccount9 ();  // shared account belongs to raunak
		
		System.out.println(" Raunak's  Init Balance  = "+account.getBalance());
		
		Customer9 t1 = new Customer9 (account, "Raunak is doing PhonePay");
		Customer9  t2 = new Customer9 (account, "Raunak is Brother is doing GPay");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Balance  = "+account.getBalance());

	}

}
//  check changenable output