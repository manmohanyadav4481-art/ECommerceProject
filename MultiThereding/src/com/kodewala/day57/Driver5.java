package com.kodewala.day57;

class Mythread0 extends Thread
{
	@Override
	public void run ()
	{
		System.out.println("Mythread.run()................executing the task... : "+Thread.currentThread().getName());
	}
}


public class Driver5 {

	public static void main(String[] args) {
		
		System.out.println("Driver4.main()  START : "+Thread.currentThread().getName());
		
		Mythread0 t1 = new Mythread0 ();  // new thread created
		t1.setName("t1");
		t1.start(); // new thread started 
		
        System.out.println("Driver0.main() END :  "+Thread.currentThread().getName());
        
      
	}
	
	public void someMethod()
	{
		System.out.println(" who is exeuting someMethod() ? : "+Thread.currentThread().getName());
		System.out.println("Driver2.someMethod()");
	}

}
