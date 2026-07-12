package com.kodewala.day59;

class Cooking5 extends Thread
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

public class Driver4 {

	public static void main (String[]args) throws InterruptedException
	{
		Thread.currentThread().setName("Waiter");
		System.out.println("Waiter took the Order.......["+Thread.currentThread().getName()+"]");
		
		Cooking5 t1 = new Cooking5();
		t1.setName("Cook");
		t1.start();
		
		t1.join(); // Waiter thread will here till food is cooked 
		
		System.out.println("Waiter started serving food ["+Thread.currentThread().getName()+"]");
		
	}
}