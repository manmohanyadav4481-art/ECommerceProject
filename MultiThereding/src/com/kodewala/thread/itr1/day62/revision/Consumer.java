package com.kodewala.thread.itr1.day62.revision;

public class Consumer extends Thread 
{
	Task task;

	public Consumer(Task task) {
	
		this.task = task;
	}
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try {
				task.consome();
				sleep(3000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
