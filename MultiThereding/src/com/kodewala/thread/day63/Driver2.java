package com.kodewala.thread.day63;

class FirstThread3 extends Thread
{
	@Override
	public void run () {
		boolean status = sendEmail();
	}

	public boolean sendEmail()
	{
		return true;
	}
}
public class Driver2 {

	public static void main(String[] args) {
	
		FirstThread3 f = new FirstThread3();
		
		
		
		f.start();

		FirstThread3 f1 = new FirstThread3();
		f1.start();
	}

}
