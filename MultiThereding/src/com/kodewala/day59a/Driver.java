package com.kodewala.day59a;

class Task
{
	void printEvenNumber ()
	{
		for (int i= 0; i<20; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number : "+i);
			}
		}
	}
	void printoddNumber ()
	{
		for (int i= 0; i<20; i++)
		{
			if(i%2 !=0)
			{
				System.out.println("Odd Number : "+i);
			}
		}
	}
}
class Oddthread extends Thread
{
	Task task;

	public Oddthread(Task task) {
	
		this.task = task;
	}
	
	public void run()
	{
		task.printoddNumber();
	}
	
}


class Eventhread extends Thread
{
	Task task;

	public Eventhread(Task task) {
	
		this.task = task;
	}
	
	public void run()
	{
		task.printEvenNumber();
	}
	
}

public class Driver {

	public static void main(String[] args) {
		
		Task task = new Task();
		
		Oddthread od = new Oddthread(task);
		od.start();
		
		Eventhread en = new Eventhread(task);
		en.start();
		
	}
}
