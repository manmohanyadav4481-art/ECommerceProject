package com.kodewala.day60a;


class BankAccount2 {
	
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

class Customer2 extends Thread {
	private BankAccount2 account;
	
	public Customer2 (BankAccount2 account, String name) {
		
		super (name);
		this.account =account;
		
	}
	@Override
	public void run()
	{
		account.withdraw(800);
	}
}
public class RaceConditionDemo2 {

	public static void main(String[] args) throws Exception {
	
		BankAccount2 account = new BankAccount2 ();  // shared account belongs to raunak
		
		
		
		Customer2 t1 = new Customer2 (account, "PhonePay");
		Customer2  t2 = new Customer2 (account, "GPay");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Balance  = "+account.getBalance());

	}

}
// check chengnable output
