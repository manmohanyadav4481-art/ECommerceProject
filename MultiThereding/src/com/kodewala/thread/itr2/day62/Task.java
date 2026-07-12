package com.kodewala.thread.itr2.day62;

public class Task {

	  int number;
	  boolean isDataAvailable =false;
	  
	  public synchronized void produce (int _num) throws InterruptedException
	
	  {
		 while (isDataAvailable)
		 {
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
