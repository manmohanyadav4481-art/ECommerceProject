package com.kodewala.day61;

// this is Releseing object lock

class Task0
{
	synchronized void doPayment () throws InterruptedException  // this method is being executed in parallel  (t1 and t2 )
	{
		for (int i= 0; i<10; i++)
		{
			Thread.sleep(1000);
				System.out.println("Number : " + i + " --> " + Thread.currentThread().getName());
			}
		}
	}

class Printerthread0 extends Thread
{
	Task0 task;

	public Printerthread0 (Task0 task) {
	
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

public class Driver0 {

	public static void main(String[] args) {
		
		Task0 user1 = new Task0();
		
		Printerthread0 od = new Printerthread0(user1);
		od.start();
		
		Task0 user2 = new Task0();
		
		Printerthread0 en = new Printerthread0(user2);
		en.start();
	}
}