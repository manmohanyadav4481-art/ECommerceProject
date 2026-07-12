package com.kodewala.cf4;

import java.util.concurrent.CompletableFuture;

public class Driver {

	public static void main(String[] args) {
		
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(()->10);
		
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(()->30);
		
        CompletableFuture<Integer> finalfuture = future1.thenCombineAsync(future2, (n1,n2) ->n1+n2);
       
        CompletableFuture.anyOf(future1, future2);
        
        System.out.println("Task has been completed....");
	}

}
