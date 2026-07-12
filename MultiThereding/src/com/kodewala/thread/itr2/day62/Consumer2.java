package com.kodewala.thread.itr2.day62;



public class Consumer2 extends Thread
{

	Task task;

	public Consumer2(Task task) {
		
		this.task = task;
	}
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try {
				
				task.consume();
				sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
