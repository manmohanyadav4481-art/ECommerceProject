package com.kodewala.day57.revision;

class Mythread extends Thread
{
	@Override
	public void run () {
		
		for(int i=0; i<10; i++)
		{
		   System.out.println("Mythread.run()"+i+"  "+Thread.currentThread().getName());
	   }
		
	}
}

public class Driver {

	public static void main(String[] args) {
	
		Mythread d = new Mythread ();
		
		d.start();
		
		Mythread d1 = new Mythread ();
		
		d1.start();
}

}
	
	