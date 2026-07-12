package com.kodewala.day59a;

class Task1
{
	void printEvenNumber ()
	{
		for (int i= 0; i<50; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number : "+i+ Thread.currentThread().getName());
			}
		}
	}
	void printoddNumber ()
	{
		for (int i= 0; i<20; i++)
		{
			if(i%2 !=0)
			{
				System.out.println("Odd Number : "+i+ Thread.currentThread().getName());
			}
		}
	}
}
class Oddthread1 extends Thread
{
	Task1 task;

	public Oddthread1(Task1 task) {
	
		this.task = task;
	}
	@Override
	public void run()
	{
		task.printoddNumber();
	}
	
}


class Eventhread1 extends Thread
{
	Task1 task;

	public Eventhread1(Task1 task) {
	
		this.task = task;
	}
	@Override
	public void run()
	{
		task.printEvenNumber();
	}
	
}

public class Driver0 {

	public static void main(String[] args) {
		
		Task1 task1 = new Task1();
		
		Oddthread1 od = new Oddthread1(task1);
		od.start();
		
		Task1 task2 = new Task1();
		
		Eventhread1 en = new Eventhread1(task2);
		en.start();
		
	}
}
