package com.kodewala.thread.day64;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NotifyDelivery implements Runnable
{

	@Override
	public void run() {
	
		System.out.println("NotifyDelivery.run() START.."+Thread.currentThread().getName());
		System.out.println("comfirm delivery");
		System.out.println("NotifyDelivery.run() END.."+Thread.currentThread().getName());
		
	}
	
}

public class Driver {

	public static void main(String[] args) {
   
		ExecutorService e = Executors.newSingleThreadExecutor();
		
		ExecutorService e1 =Executors.newCachedThreadPool();
		
		ExecutorService ex = Executors.newFixedThreadPool(10);
		for (int i=0; i<10; i++)
		{
			NotifyDelivery n = new NotifyDelivery();
			ex.execute(n);
			e.execute(n);
			e1.execute(n);
		}
		ex.shutdown();

	}

}
