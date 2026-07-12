package com.kodewala.thread.itr1.day62.revision;

public class Product extends Thread 
{
   Task task;

   public Product(Task task) {

	this.task = task;
   }
   public void run ()
   {
	   for(int i=0; i<10; i++)
	   {
		   try {
			   task.produces(i);
			sleep(3000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   }
   }
   
}
