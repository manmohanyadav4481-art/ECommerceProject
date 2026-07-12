package com.kodewala.day58;

class Mythread1 implements Runnable
{

	@Override
	public void run()  // Running  
	{
		
		System.out.println("Mythread1.run()...........");
		
	}
	
}

public class Driver {

	public static void main(String[] args) {
		
	Mythread1 mythread = new Mythread1 ();	

	  Thread t1 = new Thread(mythread); // New Born Thread object created
	  t1.start();  // Threaded moved form new born runeable
	}

}


