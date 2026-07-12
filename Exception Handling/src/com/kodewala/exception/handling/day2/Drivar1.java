package com.kodewala.exception.handling.day2;

public class Drivar1 {

	public static void main(String[] args) {
	
		Drivar1 dr = new Drivar1 ();
		dr.m1();
		
		

	}
	public void m1 ()
	{
		System.out.println("Drivar1.m1()");
		m2();
	}
	public void m2()
	{
		System.out.println("Drivar1.m2()");
		m1();
	}

}
