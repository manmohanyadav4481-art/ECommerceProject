package com.kodewala.day61;

// this is holding object lock

class Task
{
	synchronized void doPayment () throws InterruptedException  // this method is being executed in parallel  (t1 and t2 )
	{
		for (int i= 0; i<10; i++)
		{
			Thread.sleep(5000);
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
		try {
			task.doPayment();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // calling on shared object
	}
	
}

public class Driver {

	public static void main(String[] args) {
		
		Task user1 = new Task();
		
		Printerthread od = new Printerthread(user1);
		od.start();
		
		Task user2 = new Task();
		
		Printerthread en = new Printerthread(user2);
		en.start();
	}
}