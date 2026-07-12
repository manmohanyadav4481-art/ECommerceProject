package com.kodewala.thread.itr2.day62;



public class Producer2 extends Thread
{

	Task task;

	public Producer2(Task task) {
		
		this.task = task;
	}
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try {
				
				task.produce(i);
				sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}