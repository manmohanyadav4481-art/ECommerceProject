

package com.kodewala.day59;

class Cooking1 extends Thread
{
	public void run()
	{
		System.out.println("Food is being prepared ....["+Thread.currentThread().getName()+"]");
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Food preparation done.....["+Thread.currentThread().getName()+"]");
	}
}

public class Driver0 {

	public static void main (String[]args) 
	{
		Thread.currentThread().setName("Waiter");
		System.out.println("Waiter took the Order.......["+Thread.currentThread().getName()+"]");
		
		Cooking1 t1 = new Cooking1();
		t1.setName("Cook");
		t1.start();
		
		System.out.println("Waiter started serving food ["+Thread.currentThread().getName()+"]");
		
	}
}