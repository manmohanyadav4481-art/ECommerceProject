package com.kodewala.thread.itr2.day62;



public class Driver {

	public static void main(String[] args) {
		
		Task task = new Task();
	
		Producer2 p = new Producer2(task);
		p.start();
		
		Consumer2 c = new Consumer2(task);
		c.start();

	}

}
