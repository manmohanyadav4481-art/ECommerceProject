package com.Kodewala.String.memorymgmt.day19;

public class Main {
	
	public static void main (String[] args)
	{
		Main m = new Main ();
		m.m1();
		System.out.println("Main.main()");
	}

	public void m1() 
	{
		m2();
		System.out.println("Main.m1()");
	}
	
	public void m2 ()
	{
		m3();
		System.out.println("Main.m2()");
	}
	
	public void m3 ()
	{
		System.out.println("Main.m3()");
	}
}
