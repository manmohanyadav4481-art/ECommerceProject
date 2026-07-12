package com.kodewala.thread.itr6.day62;



public class Consumer6 extends Thread
{

	Task6 task;

	public Consumer6(Task6 task) {
		
		this.task = task;
	}
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try {
			
				task.consume();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}