package com.kodewala.day60a;


class BankAccount5 {
	
	private int balance =1000;
	
	public void withdraw (int amount) {
		
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

class Customer5 extends Thread {
	private BankAccount5 account;
	
	public Customer5 (BankAccount5 account, String name) {
		
		super (name);
		this.account =account;
		
	}
	@Override
	public void run()
	{
		account.withdraw(800);
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
// changeneable the output