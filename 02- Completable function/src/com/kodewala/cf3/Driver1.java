package com.kodewala.cf3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Driver1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(()->10);
		
		System.out.println(future1.get());
		
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(()->30);
		
		System.out.println(future2.get());
		
        CompletableFuture<Integer> finalfuture = future1.thenCombineAsync(future2, (n1,n2) ->n1+n2);
       
        System.out.println(finalfuture.get());
        
        System.out.println(finalfuture.join());
	}

}
