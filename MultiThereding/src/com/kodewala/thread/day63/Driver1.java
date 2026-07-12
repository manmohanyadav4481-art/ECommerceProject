package com.kodewala.thread.day63;


class FirstThread2 extends Thread
{
	@Override
	public void run () {
		System.out.println("FirstThread.run() START "+Thread.currentThread().getName());
	    Thread.yield(); // pause the current thread and give chance to other thread
	    System.out.println("FirstThread2.run() END "+Thread.currentThread().getName());
	}
	
	public boolean someMethod()
	{
		//account created logic
		return true;
	}
}
public class Driver1 {

	public static void main(String[] args) {
	
		FirstThread2 f = new FirstThread2();
		
	   boolean status =f.someMethod();
		if(status)
		{
			System.out.println("Account has been created successfully");
		}
		else
		{
			System.out.println("faild to create an account");
		}
		f.start();

		FirstThread2 f1 = new FirstThread2();
		
		f1.start();
	
		
	}

}
