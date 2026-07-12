package com.kodewala.thread.itr1.day62;

public class Driver {

	public static void main(String[] args) {
		
		Task task = new Task();
	
		Producer1 p = new Producer1(task);
		p.start();
		
		Consumer1 c = new Consumer1(task);
		c.start();

	}

}
