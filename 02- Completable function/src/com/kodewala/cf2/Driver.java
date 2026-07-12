package com.kodewala.cf2;


import java.util.concurrent.CompletableFuture;

public class Driver {

	public static void main(String[] args) {
		
		//

		CompletableFuture cf = CompletableFuture.supplyAsync(()->{
			String name = "kodewala";
			
			return name;
		}).thenApplyAsync((n)->n.toUpperCase());
		
		System.out.println("response :: "+cf.join());
	
		
	}

}