package com.kodewala.thread.day63;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class EmailSender implements Callable<String>
{

	@Override
	public String call() 
	{
		System.out.println(Thread.currentThread().getName());
		return "faild ....fafsefajldk";
	}
	
}
public class Driver3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {

	ExecutorService es	= Executors.newFixedThreadPool(1);

		EmailSender task = new EmailSender();
	
	  Future<String> response = es.submit(task);
	  System.out.println("response from call () method is "+response.get());
	}

}
