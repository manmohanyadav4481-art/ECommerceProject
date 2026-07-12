package com.kodewala.day57;

class Mythread1 extends Thread
{
	@Override
	public void run ()
	{
		System.out.println("Mythread.run()................executing the task... : "+Thread.currentThread().getName());
	
		Payment p = new Payment ();
		p.doPayment();
		
	}
}


public class Driver6 {

	public static void main(String[] args) {
		
		System.out.println("Driver4.main()  START : "+Thread.currentThread().getName());
		
		Mythread1 t1 = new Mythread1 ();  // new thread created
		t1.setName("t1");
		t1.start(); // new thread started 
		
        
        
        Mythread1 t2 = new Mythread1 ();  // new thread created
		t2.setName("t2");  
		t2.start(); // new thread started ---> main thread +T2
		
		System.out.println("Driver6.main() END : "+Thread.currentThread().getName());
	}
	
}

class Payment 

{
	public void doPayment ()
	{
		System.out.println("Payment.doPayment() : "+Thread.currentThread().getName());
	}
}

// we chack t1 and t2 change the position
