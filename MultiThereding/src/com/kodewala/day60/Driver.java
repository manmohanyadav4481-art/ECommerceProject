package com.kodewala.day60;



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
		task.printNumber();  // calling on shared object
	}
	
}

public class Driver {

	public static void main(String[] args) {
		
		Task4 shared = new Task4();
		
		Printerthread2 od = new Printerthread2(shared);
		od.start();
		
		Printerthread2 en = new Printerthread2(shared);
		
	}
}

// thread 0 got luck and excutede is synchronized
// if not synchronized the output is 0011001 samthing
