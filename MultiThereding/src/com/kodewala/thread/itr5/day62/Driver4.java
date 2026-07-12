package com.kodewala.thread.itr5.day62;



public class Driver4 {

	public static void main(String[] args) {
	
		Task4 task = new Task4();  // shard object
		
		Producer4 p = new Producer4(task);
		p.setName("Producer");
		p.start();
		
		Consumer4 c = new Consumer4(task);
		c.setName("Consumer");
		c.start();

	}




	}


