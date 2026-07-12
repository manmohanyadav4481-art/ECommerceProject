package com.kodewala.thread.day63;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class EmailSender1 implements Callable<Boolean>
{

	@Override
	public Boolean call() 
	{
		System.out.println(Thread.currentThread().getName());
		//return false;
		return true;
	}
	
}
public class Driver4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {

	ExecutorService es	= Executors.newFixedThreadPool(1);

		EmailSender1 task = new EmailSender1();
	
	  Future<Boolean> response = es.submit(task);
	  System.out.println("response from call method is "+response.get());
	}

}
