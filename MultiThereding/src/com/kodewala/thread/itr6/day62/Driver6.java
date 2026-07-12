package com.kodewala.thread.itr6.day62;

public class Driver6 {

	public static void main(String[] args) {
		
        Task6 task = new Task6();  // shard object
		
		Producer6 p = new Producer6(task);
		p.setName("Producer");
		p.start();
		
		Consumer6 c = new Consumer6(task);
		c.setName("Consumer");
		c.start();

	}

}
