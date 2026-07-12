package com.kodewala.thread.itr5.day62;



public class Consumer4 extends Thread
{

	Task4 task;

	public Consumer4(Task4 task) {
		
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