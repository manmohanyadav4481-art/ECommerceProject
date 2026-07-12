package com.kodewala.day59.revesion;

class School implements Runnable {
	
	@Override
	public void run ()
	{
	  
	}
}
public class Driver {

	public static void main(String[] args) throws InterruptedException {
		
		School s = new School ();
		
		Thread t = new Thread(s);
		t.start();
	}

}
