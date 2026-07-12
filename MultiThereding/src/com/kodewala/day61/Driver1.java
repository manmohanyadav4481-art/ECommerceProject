package com.kodewala.day61;

// this is Releseing object lock

class Task1
{
	synchronized void doPayment () throws InterruptedException  // this method is being executed in parallel  (t1 and t2 )
	{
		for (int i= 0; i<10; i++)
		{
			wait(2000);
				System.out.println("Number : " + i + " --> " + Thread.currentThread().getName());
			}
		}
	}

class Printerthread1 extends Thread
{
	Task1 task;

	public Printerthread1 (Task1 task) {
	
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

public class Driver1 {

	public static void main(String[] args) {
		
		Task1 user1 = new Task1();
		
		Printerthread1 od = new Printerthread1(user1);
		od.start();
		
		Task1 user2 = new Task1();
		
		Printerthread1 en = new Printerthread1(user2);
		en.start();
	}
}