package com.kodewala.day60a;


class BankAccount4 {
	
	private int balance =1000;
	
	public synchronized void withdraw (int amount) {  // only one Thread will be able to execute the method.
		
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

class Customer4 extends Thread {
	private BankAccount4 account;
	
	public Customer4 (BankAccount4 account, String name) {
		
		super (name);
		this.account =account;
		
	}
	@Override
	public void run()
	{
		account.withdraw(800);
	}
}
public class RaceConditionDemo4 {

	public static void main(String[] args) throws Exception {
	
		BankAccount4 account = new BankAccount4 ();  // shared account belongs to raunak
		
		System.out.println(" Raunak's  Init Balance  = "+account.getBalance());
		
		Customer4 t1 = new Customer4 (account, "Raunak is doing PhonePay");
		Customer4  t2 = new Customer4 (account, "Raunak is Brother is doing GPay");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Balance  = "+account.getBalance());

	}

}
//  check changenable output