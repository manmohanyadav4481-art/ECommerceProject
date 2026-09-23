package com.kodewala.cf2;


import java.util.concurrent.CompletableFuture;

public class Driver01 {

	public static void main(String[] args) {
		
		//

		CompletableFuture cf = CompletableFuture.supplyAsync(()->{
			String name = "kodewala";
			
			return name;
		}).thenApply((n)->n.toUpperCase());
		
		System.out.println("response :: "+cf.join());
	
		
	}

}