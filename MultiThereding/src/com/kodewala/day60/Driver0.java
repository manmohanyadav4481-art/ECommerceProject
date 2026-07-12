package com.kodewala.day60;



class Task
{
	 void printNumber ()  // this method is being executed in parallel  (t1 and t2 )
	{
		for (int i= 0; i<10; i++)
		{
				System.out.println("Number : " + i + " --> " + Thread.currentThread().getName());
			}
		}
	}

class Printerthread extends Thread
{
	Task task;

	public Printerthread (Task task) {
	
		this.task = task;
	}
	@Override
	public void run()
	{
		task.printNumber();  // calling on shared object
	}
	
}

public class Driver0 {

	public static void main(String[] args) {
		
		Task shared = new Task();
		
		Printerthread od = new Printerthread(shared);
		od.start();
		
		Printerthread en = new Printerthread(shared);
		en.start();
	}
}

// not synchronized