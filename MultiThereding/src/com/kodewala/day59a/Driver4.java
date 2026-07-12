package com.kodewala.day59a;

class Task5
{
	 void printNumber ()  // this method is being executed in parallel  (t1 and t2 )
	{
		for (int i= 0; i<10; i++)
		{
			
				System.out.println("Number : "+i+ " --> " + Thread.currentThread().getName());
			}
		}
	}

class Printerthread3 extends Thread
{
	Task5 task;

	public Printerthread3 (Task5 task) {
	
		this.task = task;
	}
	@Override
	public void run()
	{
		task.printNumber();
	}
	
}

public class Driver4 {

	public static void main(String[] args) {
		
		Task5 task = new Task5();
		
		Printerthread3 od = new Printerthread3(task);
		od.start();
		
		Printerthread3 en = new Printerthread3(task);
		en.start();
		
	}
}

