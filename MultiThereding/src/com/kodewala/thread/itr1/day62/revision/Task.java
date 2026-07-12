package com.kodewala.thread.itr1.day62.revision;

public class Task 
{
	int number;
	boolean isDataAvaleable = false;
	
	public synchronized void produces (int _num) throws InterruptedException
	{
		while (isDataAvaleable)
		{
			wait();
		}
		number = _num;
		System.out.println("producering date : "+number);
		isDataAvaleable=true;
		notify();
	}
	
	public synchronized void consome () throws InterruptedException
	{
		while (!isDataAvaleable)
		{
			wait();
		}
		System.out.println("Consoming it : "+number);
		isDataAvaleable=false;
		notify();
	}

}
