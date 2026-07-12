package com.kodewala.day57;


class Mythread6 extends Thread
{
	@Override
	public void run ()
	{
		for (int i=0; i<10; i++)
		{
			System.out.println("MyThread.run() : "+i+"   "+Thread.currentThread());
		}
	}
}

public class Driver10 {

	public static void main(String[] args) {
		
		Mythread6 t1 = new Mythread6 ();
		t1.start();

	}

}