package com.kodewala.day58;

class PrintNumbers3 extends Thread
{
	public void run()
	{
		System.out.println("PrintNumbers.run()......");
		for(int i=0; i<10; i++)
		{
		System.out.println("PrintNumbers1.run()"+i+" and printed by "+Thread.currentThread().getName());	 
		if(i==5)
		{
			System.out.println("sending "+Thread.currentThread().getName() +"to sleepint/waiting state");
		    try {
				Thread.currentThread().sleep(500);  // sleep for 5 sec
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		    
		    System.out.println(" sleep time over .. start execution again......"+Thread.currentThread().getName());
		}
			
		}
	} //termenated
}

public class Driver6 {

	public static void main(String[] args) {
	
		PrintNumbers3 printNumbers3 =new PrintNumbers3(); // new
		printNumbers3.run();  //runneable

	}

}