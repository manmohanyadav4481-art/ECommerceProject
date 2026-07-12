package com.kodewala.thread.itr6.day62;

public class Task6 {

	  int number;
	  boolean isDataAvailable =false;
	  
	  public synchronized void produce (int _num) throws InterruptedException
	
	  {
		 while (isDataAvailable)
		 {
			 System.out.println(Thread.currentThread().getName() +" is waiting.......");
			 wait();
		 }
		 
		 number = _num;
		 System.out.println("produceing date : "+number);
		 isDataAvailable =true;
		 notify();
	  }
	  
	  public synchronized void consume () throws InterruptedException
	  {
		  while (!isDataAvailable)
		  {
			  System.out.println(Thread.currentThread().getName() +" is waiting.......");
				 wait();
		  }
		  System.out.println("consuming it : "+number);
		  isDataAvailable =false;
		  notify();
	  }

}
