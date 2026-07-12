package com.kodewala.day57;


class Mythread7 extends Thread
{
	@Override
	public void run ()
	{
		for (int i=0; i<10; i++)
		{
			System.out.println("MyThread.run() : "+i+"   "+Thread.currentThread().getName());
		}
	}
}

public class Driver11 {

	public static void main(String[] args) {
		
		Mythread7 t1 = new Mythread7 ();
		t1.start();

	}

}