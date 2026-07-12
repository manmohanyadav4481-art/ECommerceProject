package com.kodewala.thread.itr4.day62;

public class Consumer3 extends Thread
{

	Task task;

	public Consumer3(Task task) {
		
		this.task = task;
	}
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try {
				sleep(1000);
				task.consume();
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}