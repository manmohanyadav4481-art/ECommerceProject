package com.kodewala.cf;

import java.util.concurrent.CompletableFuture;

public class Driver0 {

	public static void main(String[] args) {
		
		System.out.println("Driver0.main() START");
		CompletableFuture.runAsync(() -> {
			System.out.println("This is from run Async");
		});
		System.out.println("Driver0.main() END");

	}

}
