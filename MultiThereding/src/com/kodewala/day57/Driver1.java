package com.kodewala.day57;

public class Driver1 {

	public static void main(String[] args) {
		
		System.out.println("Who is executing this code ?  : "+Thread.currentThread().getName());

		Thread.currentThread().setName("My thread");
		
		System.out.println("Who is executing this code ?  : "+Thread.currentThread().getName());


		System.out.println("Driver0.main()");
		
		

	}

}
