package com.kodewala.thread.day63;



class FirstThread1 extends Thread
{
	@Override
	public void run () // does not return anything......and not exception
	{
		System.out.println("FirstThread.run()  START..."+Thread.currentThread().getName());
	    Thread.yield(); // pause the current and give chance to other thread 
	    System.out.println("FirstThread1.run()  END...."+Thread.currentThread().getName());
	}
}

public class Driver0 {

	public static void main(String[] args) {
	
		FirstThread1 f = new FirstThread1();
		f.start();

		FirstThread1 f1 = new FirstThread1();
		f1.start();
	}

}
