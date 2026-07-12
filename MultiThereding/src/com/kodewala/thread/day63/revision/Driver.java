package com.kodewala.thread.day63.revision;

class Student extends Thread
{
	public void run()
	{
		System.out.println("Student.run()"+Thread.currentThread().getName());
		Thread.yield();
		System.out.println("Student.run()"+Thread.currentThread().getName());
	}
	public boolean sameMethod()
	{
		return false;
	}
}

public class Driver {
	
	public static void main(String[] args) {
	 
	   
	  Student s = new Student ();
	  
	  boolean status =s.sameMethod();
	  if(status)
	  {
		  System.out.println("Account create successfully");
	  }else {
		  System.out.println("fail the create account ");
	  }
	  
	s.start();
	Student s1 = new Student();
	s1.start();
	  
       
	}
}
