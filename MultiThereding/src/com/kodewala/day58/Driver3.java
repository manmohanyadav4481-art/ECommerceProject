package com.kodewala.day58;

class PrintNumbers extends Thread
{
	public void run()
	{
		System.out.println("PrintNumbers.run()......");
		for(int i=0; i<10; i++)
		{
			System.out.println("PrintNumbers.run()"+i);
		
			
		}
	}
}

public class Driver3 {

	public static void main(String[] args) {
	
		PrintNumbers printNumbers =new PrintNumbers(); // new
		printNumbers.start();  //runneable

	}

}
