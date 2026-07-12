package com.kodewala.cf1;

import java.util.concurrent.CompletableFuture;

public class Driver {

	public static void main(String[] args) {
		
		//

		CompletableFuture cf = CompletableFuture.supplyAsync(()->{
			String name = "kodewala";
			
			return name;
		}).thenAccept(a-> System.out.print("Hello "));
		
		System.out.println("response :: "+cf.join());
	
		
	}

}
