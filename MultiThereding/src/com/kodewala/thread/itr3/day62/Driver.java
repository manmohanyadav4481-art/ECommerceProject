package com.kodewala.thread.itr3.day62;

public class Driver {

	public static void main(String[] args) {
		
		Task task = new Task();
	
		Producer p = new Producer(task);
		p.start();
		
		Consumer c = new Consumer(task);
		c.start();

	}

}
