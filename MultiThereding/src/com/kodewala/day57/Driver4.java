package com.kodewala.day57;

class Mythread extends Thread
{
	@Override
	public void run ()
	{
		System.out.println("Mythread.run()................executing the task... : "+Thread.currentThread().getName());
	}
}


public class Driver4 {

	public static void main(String[] args) {
		
		System.out.println("Driver4.main()  START : "+Thread.currentThread().getName());
		
		Mythread t1 = new Mythread ();  // new thread created
		
		t1.start(); // new thread started 
		
        System.out.println("Driver0.main() END :  "+Thread.currentThread().getName());
        
      
	}
	
	public void someMethod()
	{
		System.out.println(" who is exeuting someMethod() ? : "+Thread.currentThread().getName());
		System.out.println("Driver2.someMethod()");
	}

}



