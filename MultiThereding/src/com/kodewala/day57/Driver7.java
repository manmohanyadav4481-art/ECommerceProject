package com.kodewala.day57;

class Mythread2 extends Thread
{
	@Override
	public void run ()
	{
		System.out.println("Mythread.run()................executing the task... : "+Thread.currentThread().getName());
	
		Payment0 p = new Payment0 ();
		p.doPayment();
		
	}
}


public class Driver7 {

	public static void main(String[] args) {
		
		System.out.println("Driver4.main()  START : "+Thread.currentThread().getName());
		
		Mythread2 t1 = new Mythread2 ();  // new thread created
		t1.setName("t1");
		t1.run(); // new thread started 
		
       
        
        Mythread2 t2 = new Mythread2 ();  // new thread created
		t2.setName("t2");  
		t2.run(); // new thread started ---> main thread +T2
      
		System.out.println("Driver6.main() END : "+Thread.currentThread().getName());
	}
	
}

class Payment0 

{
	public void doPayment ()
	{
		System.out.println("Payment.doPayment() : "+Thread.currentThread().getName());
	}
}

// we chack t1 and t2 change the position