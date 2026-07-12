package com.kodewala.thread.itr1.day62.revision;

public class Driver {

	public static void main(String[] args) {
		
		Task t = new Task();
		
		Product p = new Product(t);
		p.start();
		
		Consumer c = new Consumer(t);
		c.start();

	}

}
