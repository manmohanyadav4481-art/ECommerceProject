package com.kodewala.day61;

// this is Releseing object lock

class Task3
{
	 void doPayment () throws InterruptedException  // this method is being executed in parallel  (t1 and t2 )
	{
		for (int i= 0; i<10; i++)
		{
		  this.wait(2000);
				System.out.println("Number : " + i + " --> " + Thread.currentThread().getName());
			}
		}
	}

class Printerthread3 extends Thread
{
	Task3 task;

	public Printerthread3 (Task3 task) {
	
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

public class Driver3 {

	public static void main(String[] args) {
		
		Task3 user1 = new Task3();
		
		Printerthread3 od = new Printerthread3(user1);
		od.start();
		
		Task3 user2 = new Task3();
		
		Printerthread3 en = new Printerthread3(user2);
		en.start();
	}
}