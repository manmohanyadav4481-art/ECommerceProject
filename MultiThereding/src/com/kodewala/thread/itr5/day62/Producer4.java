package com.kodewala.thread.itr5.day62;



public class Producer4 extends Thread
{

	Task4 task;

	public Producer4(Task4 task) {
		
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
