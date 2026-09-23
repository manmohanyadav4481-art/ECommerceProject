package com.kodewala.cf;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Driver01 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("Driver0a.main() START ");
		CompletableFuture completableFuture = CompletableFuture.runAsync(()->{
			System.out.println("this is from run Async");
		});
	
		System.out.println(completableFuture.join());
		System.out.println("Driver0a.main() END ");
	}

}
