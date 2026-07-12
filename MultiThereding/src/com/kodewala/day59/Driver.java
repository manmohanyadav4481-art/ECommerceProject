package com.kodewala.day59;

class Cooking extends Thread
{
	public void run()
	{
		System.out.println("Food is being prepared ....");
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Food preparation done.....");
	}
}

public class Driver {

	public static void main (String[]args)
	{
		System.out.println("Waiter took the Order.......");
		
		Cooking t1 = new Cooking();
		t1.start();
		
		System.out.println("Waiter started serving food ");
		
	}
}
