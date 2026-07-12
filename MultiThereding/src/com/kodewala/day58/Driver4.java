package com.kodewala.day58;

class PrintNumbers1 extends Thread
{
	public void run()
	{
		System.out.println("PrintNumbers.run()......");
		for(int i=0; i<10; i++)
		{
		System.out.println("PrintNumbers1.run()"+i);	 
		if(i==5)
		{
			System.out.println("sending "+Thread.currentThread().getName() +"to sleepint/waiting state");
		    try {
				Thread.currentThread().sleep(500);  // sleep for 5 sec
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		    
		    System.out.println(" sleep time over .. start execution again......");
		}
			
		}
	} //termenated
}

public class Driver4 {

	public static void main(String[] args) {
	
		PrintNumbers1 printNumbers1 =new PrintNumbers1(); // new
		printNumbers1.start();  //runneable

	}

}