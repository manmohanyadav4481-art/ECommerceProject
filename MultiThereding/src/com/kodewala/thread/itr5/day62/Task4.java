package com.kodewala.thread.itr5.day62;


public class Task4 {

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
			  wait();
		  }
		  System.out.println("consuming it : "+number);
		  isDataAvailable =false;
		  notify();
	  }

}
