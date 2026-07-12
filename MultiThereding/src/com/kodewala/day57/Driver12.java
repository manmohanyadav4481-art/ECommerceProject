package com.kodewala.day57;


class Mythread8 extends Thread
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

public class Driver12 {

	public static void main(String[] args) {
		
		Mythread8 t0 = new Mythread8 ();
		t0.start();

		Mythread8 t1 = new Mythread8 ();
		t1.start();

	}

}