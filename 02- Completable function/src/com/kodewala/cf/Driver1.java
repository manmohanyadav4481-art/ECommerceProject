package com.kodewala.cf;

import java.util.concurrent.CompletableFuture;

public class Driver1 {

	public static void main(String[] args) {
		
		CompletableFuture<String> comp = CompletableFuture.supplyAsync(()-> {
		System.out.println("i am from supply async ");
		return "success";
		});
		System.out.println("Completablefuture response from supply async, "+comp.join());
		}

	}


