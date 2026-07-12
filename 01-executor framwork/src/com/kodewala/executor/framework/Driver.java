package com.kodewala.executor.framework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class NotifyDelivery implements Runnable
{

	@Override
	public void run() {
		System.out.println("NotifyDelivery.run() START..");
		DeliveryService de = new DeliveryService ();
		de.confirmDelivery();
		System.out.println("NotifyDelivery.run() END..");
		
	}
	
}

public class Driver {

	//java 1.5
	// No of threads ? x reuse
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
	  
		// create the executor service
		ExecutorService ess = Executors.newSingleThreadExecutor();

		NotifyDelivery task = new NotifyDelivery();
	Future result =	ess.submit(task);
	System.out.println(result.get());
	
		// shutdown the service
		ess.shutdown();
	}

}
