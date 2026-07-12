package com.kodewala.day59a;

class Task6
{
	 void printNumber ()  // this method is being executed in parallel  (t1 and t2 )
	{
		for (int i= 0; i<10; i++)
		{
			
				System.out.println("Number : "+i+ " --> " + Thread.currentThread().getName());
			}
		}
	}

class Printerthread4 extends Thread
{
	Task6 task;

	public Printerthread4 (Task6 task) {
	
		this.task = task;
	}
	@Override
	public void run()
	{
		task.printNumber();
	}
	
}

public class Driver5 {

	public static void main(String[] args) {
		
		Task6 task = new Task6(); // user1
		
		Printerthread4 od = new Printerthread4(task);
		od.start();
		
		Task6 task1 = new Task6();  // user2
		
		Printerthread4 en = new Printerthread4(task1);
		en.start();
		
	}
}
