package com.kodewala.day58;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

class Mythread4 implements Runnable
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
	
	} // once run method is completed your thread t1 is terminated / dead
	
}

public class Driver2 {

	public static void main(String[] args) {
		
	Mythread4 mythread = new Mythread4 ();	

	  Thread t1 = new Thread(mythread); // New Born Thread object created
	  t1.start();  // Threaded moved form new born runeable
	}

}
