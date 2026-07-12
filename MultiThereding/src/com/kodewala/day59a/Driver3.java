package com.kodewala.day59a;

class Task4
{
	synchronized void printNumber ()  // this method is being executed in parallel  (t1 and t2 )
	{
		for (int i= 0; i<10; i++)
		{
				System.out.println("Number : " + i + " --> " + Thread.currentThread().getName());
			}
		}
	}

class Printerthread2 extends Thread
{
	Task4 task;

	public Printerthread2 (Task4 task) {
	
		this.task = task;
	}
	@Override
	public void run()
	{
		task.printNumber();
	}
	
}

public class Driver3 {

	public static void main(String[] args) {
		
		Task4 task = new Task4();
		
		Printerthread2 od = new Printerthread2(task);
		od.start();
		
		Printerthread2 en = new Printerthread2(task);
		en.start();
		
	}
}
