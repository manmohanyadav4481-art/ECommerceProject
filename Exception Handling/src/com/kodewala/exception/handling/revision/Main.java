package com.kodewala.exception.handling.revision;

public class Main {
	public static void main (String []args) {
	
		Main ma =new Main ();
		ma.pay();

	}
	public void pay () 
	{
		pay1();
	}

	public void pay1 () 
	{
		pay();
	}
}
