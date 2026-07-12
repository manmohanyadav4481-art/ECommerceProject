package com.kodewala.cf;

import java.util.concurrent.CompletableFuture;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Driver.main() START");
		CompletableFuture com = CompletableFuture.runAsync(()-> {
		});
		System.out.println("Driver.main() END ");
		}
	}

