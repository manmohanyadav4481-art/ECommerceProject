package com.kodewala.thread.itr1.day62;

public class Producer1 extends Thread
{

	Task task;

	public Producer1(Task task) {
		
		this.task = task;
	}
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try {
				sleep(2000);
				task.produce(i);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
