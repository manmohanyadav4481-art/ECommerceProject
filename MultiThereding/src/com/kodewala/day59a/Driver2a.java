package com.kodewala.day59a;

class Task3a
{
  synchronized void printNumber ()  // this method is being executed in parallel  (t1 and t2 )
	{
		for (int i= 0; i<10; i++)
		{
				System.out.println("Number : "+i+ " --> " + Thread.currentThread().getName());
			}
		}
	}

class Printerthread1a extends Thread
{
	Task3a task;

	public Printerthread1a (Task3a task) {
	
		this.task = task;
	}
	@Override
	public void run()
	{
		task.printNumber();
	}
	
}

public class Driver2a {

	public static void main(String[] args) {
		
		Task3a task1 = new Task3a();
		
		Printerthread1a od = new Printerthread1a(task1);
		od.start();
		
		Task3a task2 = new Task3a();
		
		Printerthread1a en = new Printerthread1a(task2);
		en.start();
		
	}
}