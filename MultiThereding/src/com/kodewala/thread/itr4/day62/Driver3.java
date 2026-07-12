package com.kodewala.thread.itr4.day62;



public class Driver3 {

	public static void main(String[] args) {
		
		Task task = new Task();  // shard object
	
		Producer3 p = new Producer3(task);
		p.setName("Producer");
		p.start();
		
		Consumer3 c = new Consumer3(task);
		c.setName("Consumer");
		c.start();

	}

}
