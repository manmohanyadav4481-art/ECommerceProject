package com.kodewala.day59a;

class Task2
{
	void printNumber ()
	{
		for (int i= 0; i<50; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number : "+i+ " --> " + Thread.currentThread().getName());
			}
			
			else
			{
				System.out.println("Odd Number  : "+i+ " --> "+Thread.currentThread().getName());
			}
		}
	}
}
class Printerthread extends Thread
{
	Task2 task;

	public Printerthread (Task2 task) {
	
		this.task = task;
	}
	@Override
	public void run()
	{
		task.printNumber();
	}
	
}

public class Driver1 {

	public static void main(String[] args) {
		
		Task2 task1 = new Task2();
		
		Printerthread od = new Printerthread(task1);
		od.start();
		
		Task2 task2 = new Task2();
		
		Printerthread en = new Printerthread(task2);
		en.start();
		
	}
}
