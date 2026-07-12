package com.kodewala.thread.itr6.day62;



public class Producer6 extends Thread
{

	Task6 task;

	public Producer6(Task6 task) {
		
		this.task = task;
	}
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try {
				
				task.produce(i);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
