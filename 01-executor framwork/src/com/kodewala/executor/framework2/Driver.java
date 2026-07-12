package com.kodewala.executor.framework2;

import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class NotifyDelivery implements Runnable
{

	@Override
	public void run() {
		System.out.println("NotifyDelivery.run() "+Thread.currentThread().getName());
		DeliveryService de = new DeliveryService ();
		de.confirmDelivery();
		
		
	}
	
}

public class Driver {

	//java 1.5
	// No of threads ? x reuse
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
	  
		// create the executor service
		// ExecutorService ess = Executors.newSingleThreadExecutor(); // only single thread will be created.
        
		// ExecutorService es = Executors.newCachedThreadPool();  // thread will be decided by exe framework
		
		ExecutorService es = Executors.newFixedThreadPool(10); // thread will be decided by exe framework
		
		for (int i = 0; i < 100; i++) {    // 500 , 100 
			NotifyDelivery task = new NotifyDelivery();
			es.execute(task);	
		}
		
	
	
		// shutdown the service
		es.shutdown();
	}

}
