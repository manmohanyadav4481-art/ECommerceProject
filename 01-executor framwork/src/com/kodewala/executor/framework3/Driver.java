package com.kodewala.executor.framework3;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class NotifyDelivery implements Callable<String>
{

	@Override
	public String call () throws InterruptedException {
		System.out.println("NotifyDelivery.run() "+Thread.currentThread().getName());
		DeliveryService de = new DeliveryService ();
		de.confirmDelivery();
		
		Thread.sleep(3000);
		
		return "success";
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
		
		ExecutorService es = Executors.newFixedThreadPool(5); // thread will be decided by exe framework
		
		for (int i = 0; i < 10; i++) {    // 500 , 100 
			NotifyDelivery task = new NotifyDelivery();
		Future<String> response =	es.submit(task);
		
		System.out.println("waiting for response ");
		
		System.out.println(response.get());
		
		System.out.println("got response ");
		
		}
		
	
	
		// shutdown the service
		es.shutdown();
	}

}
