package com.kodewala.day57;

class Mythread3 extends Thread
{
	@Override
	public void run ()
	{
		System.out.println("Mythread.run()................executing the task... : "+Thread.currentThread().getName());
	
		Payment2 p = new Payment2 ();
		p.doPayment();
		
	}
}


public class Driver8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Driver4.main()  START : "+Thread.currentThread().getName());
		
		Mythread3 t1 = new Mythread3 ();  // new thread created
		t1.setName("t1");
		t1.start(); // new thread started 
		
       
        
        Mythread3 t2 = new Mythread3 ();  // new thread created
		t2.setName("t2");  
		t2.start(); // new thread started ---> main thread +T2
      
		Thread.sleep(1000);
		System.out.println("Driver6.main() END : "+Thread.currentThread().getName());
	}
	
}

class Payment2 

{
	public void doPayment ()
	{
		System.out.println("Payment.doPayment() : "+Thread.currentThread().getName());
	}
}