package com.kodewala.day59a;

class Task3
{
	void printNumber ()  // this method is being executed in parallel  (t1 and t2 )
	{
		for (int i= 0; i<50; i++)
		{
			if(i%2==0)
			{
				System.out.println("Number : "+i+ " --> " + Thread.currentThread().getName());
			}
		}
	}
}
class Printerthread1 extends Thread
{
	Task3 task;

	public Printerthread1 (Task3 task) {
	
		this.task = task;
	}
	@Override
	public void run()
	{
		task.printNumber();
	}
	
}

public class Driver2 {

	public static void main(String[] args) {
		
		Task3 task1 = new Task3();
		
		Printerthread1 od = new Printerthread1(task1);
		od.start();
		
		Task3 task2 = new Task3();
		
		Printerthread1 en = new Printerthread1(task2);
		en.start();
		
	}
}
