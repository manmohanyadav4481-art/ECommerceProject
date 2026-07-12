package com.kodewala.thread.itr1.day62;

public class Consumer1 extends Thread
{

	Task task;

	public Consumer1(Task task) {
		
		this.task = task;
	}
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try {
				sleep(2000);
				task.consume();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
