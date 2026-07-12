package com.kodewala.day61.revision;

class Task {
	
synchronized void doprint () {
		for(int i=0; i<10; i++) {
			System.out.println("Number : "+i+ "---> "+Thread.currentThread().getName());
		}
	}
}
class Print extends Thread
{
	Task task;

	public Print(Task task) {
		super();
		this.task = task;
	}
	
	public void run () {
		task.doprint();
	}
}
public class Driver {

	public static void main(String[] args) {
	
		Task t1 = new Task();
		
		Print p = new Print(t1);
		p.start();
		
		Task t2 = new Task();
		
		Print p1 = new Print(t2);
		p1.start();

	}

}
