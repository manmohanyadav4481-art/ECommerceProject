package com.kodewala.day59;

class Cooking3 extends Thread
{
	public void run()
	{
		System.out.println("Food is being prepared ....["+Thread.currentThread().getName()+"]");
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Food preparation done.....["+Thread.currentThread().getName()+"]");
	}
}

public class Driver2 {

	public static void main (String[]args) throws InterruptedException
	{
		Thread.currentThread().setName("Waiter");
		System.out.println("Waiter took the Order.......["+Thread.currentThread().getName()+"]");
		
		Cooking3 t1 = new Cooking3();
		t1.setName("Cook");
		t1.start();
		
		Thread.currentThread().sleep(6000); // Waiter thread will here till food is cooked 
		
		System.out.println("Waiter started serving food ["+Thread.currentThread().getName()+"]");
		
	}
}