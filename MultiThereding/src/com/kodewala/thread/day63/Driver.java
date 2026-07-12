package com.kodewala.thread.day63;

class FirstThread extends Thread
{
	@Override
	public void run () {
		System.out.println("FirstThread.run()"+Thread.currentThread().getName());
	}
}
class SecondThread extends Thread
{
	@Override
	public void run () 
	{
		System.out.println("SecondThread.run() Start .."+Thread.currentThread().getName());
	   
	    
	}
}
public class Driver {

	public static void main(String[] args) {
	
		FirstThread f = new FirstThread();
		f.start();

		SecondThread f1 = new SecondThread();
		f1.start();
	}

}
