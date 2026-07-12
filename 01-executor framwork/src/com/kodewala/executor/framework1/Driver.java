package com.kodewala.executor.framework1;

import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class NotifyDelivery implements Runnable
{

	@Override
	public void run() {
		System.out.println("NotifyDelivery.run() START.."+Thread.currentThread().getName());
		DeliveryService de = new DeliveryService ();
		de.confirmDelivery();
		System.out.println("NotifyDelivery.run() END.."+Thread.currentThread().getName());
		
	}
	
}

public class Driver {

	//java 1.5
	// No of threads ? x reuse
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
	  
		// create the executor service
		// ExecutorService ess = Executors.newSingleThreadExecutor(); // only single thread will be created.
        
		ExecutorService es = Executors.newCachedThreadPool();  // thread will be decided by exe framework
		
		for (int i = 0; i < 10; i++) {
			NotifyDelivery task = new NotifyDelivery();
			es.execute(task);	
		}
		
	
	
		// shutdown the service
		es.shutdown();
	}

}
