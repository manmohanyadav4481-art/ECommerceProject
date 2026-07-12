package com.kodewala.day61;

// this is Releseing object lock

class Task2
{
	synchronized void doPayment () throws InterruptedException  // this method is being executed in parallel  (t1 and t2 )
	{
		for (int i= 0; i<10; i++)
		{
		  this.wait(2000);
				System.out.println("Number : " + i + " --> " + Thread.currentThread().getName());
			}
		}
	}

class Printerthread2 extends Thread
{
	Task2 task;

	public Printerthread2 (Task2 task) {
	
		this.task = task;
	}
	@Override
	public void run()
	{
		try {
			task.doPayment();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // calling on shared object
	}
	
}

public class Driver2 {

	public static void main(String[] args) {
		
		Task2 user1 = new Task2();
		
		Printerthread2 od = new Printerthread2(user1);
		od.start();
		
		Task2 user2 = new Task2();
		
		Printerthread2 en = new Printerthread2(user2);
		en.start();
	}
}