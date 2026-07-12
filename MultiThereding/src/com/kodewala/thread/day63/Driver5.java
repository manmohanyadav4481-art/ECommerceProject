package com.kodewala.thread.day63;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class EmailSender2 implements Callable<Boolean>
{

	@Override
	public Boolean call() 
	{
		System.out.println(Thread.currentThread().getName());
		return true;
	}
	
}
public class Driver5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {

	ExecutorService es	= Executors.newFixedThreadPool(1);

		EmailSender2 task = new EmailSender2();
	
	   es.submit(task);
	  
	}

}
