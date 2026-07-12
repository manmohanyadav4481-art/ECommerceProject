package com.kodewala.day60;



class Task1
{
	synchronized void doPayment ()  // this method is being executed in parallel  (t1 and t2 )
	{
		for (int i= 0; i<10; i++)
		{
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
		task.doPayment();  // calling on shared object
	}
	
}

public class Driver2 {

	public static void main(String[] args) {
		
		Task1 user1 = new Task1();
		
		Printerthread1 od = new Printerthread1(user1);
		od.start();
		
		Task1 user2 = new Task1();
		
		Printerthread1 en = new Printerthread1(user2);
		en.start();
	}
}
