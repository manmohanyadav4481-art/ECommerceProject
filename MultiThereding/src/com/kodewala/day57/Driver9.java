package com.kodewala.day57;


class Mythread5 extends Thread
{
	@Override
	public void run ()
	{
		for (int i=0; i<10; i++)
		{
			System.out.println("MyThread.run() : "+i);
		}
	}
}

public class Driver9 {

	public static void main(String[] args) {
		
		Mythread5 t1 = new Mythread5 ();
		t1.start();

	}

}
