package com.kodewala.day58;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

class Mythread3 implements Runnable
{

	@Override
	public void run()  // Running  
	{
		
		System.out.println("Mythread1.run()........... attending kodewal class....STARTED---9 AM");
		System.out.println("Mythread1.run()...........");
		System.out.println("Mythread1.run()...........");
		System.out.println("Mythread1.run()...........");
		// t1 can go to sleep /wait/ pause state .(30 mins)--> waiting state
		// once waiting is over , T1 will move to runnable--->cpu gives time to t1 ---> running state
		System.out.println("Mythread1.run()...........");
		System.out.println("Mythread1.run()...........");
		
	System.out.println("Mythread1.run().....attending kodewala class -------END at 6 PM");	
	}
	
}

public class Driver1 {

	public static void main(String[] args) {
		
	Mythread3 mythread1 = new Mythread3 ();	

	  Thread t1 = new Thread(mythread1); // New Born Thread object created
	  t1.start();
	  t1.start();// Threaded moved form new born runeable
	}

}
