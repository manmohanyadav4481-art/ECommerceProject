package com.kodewala.day59;

class Cooking6 extends Thread
{
	public void run()
	{
		System.out.println("Food is being prepared ....["+Thread.currentThread().getName()+"]");
		
		try {
			sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Food preparation done.....["+Thread.currentThread().getName()+"]");
	}
}

public class Driver5 {

	public static void main (String[]args) throws InterruptedException
	{
		Thread.currentThread().setName("Waiter");
		System.out.println("Waiter took the Order.......["+Thread.currentThread().getName()+"]");
		
		Cooking6 t1 = new Cooking6();
		t1.setName("Cook");
		t1.start();
		
		t1.join(-100); // Waiter thread will here till food is cooked 
		
		System.out.println("Waiter started serving food ["+Thread.currentThread().getName()+"]");
		
	}
}