package com.kodewala.exception.handling.day5;

import java.io.BufferedReader;
import java.io.FileReader;


/**
 * @author manmohan yadav
 * @since 26
 * 
 * 
 * this class is ressponsible for.........
 * 
 * 
 * 
 */

public class Driver4 implements AutoCloseable
{

	public static void main(String[] args) 
	{
		
		System.out.println("Driver4.main()");

		try(BufferedReader br = new BufferedReader (new FileReader ("file path"));
		
		 Driver4 d = new Driver4 ();
				)
		{
			
		String line;
		while ((line = br.readLine()) != null) 
		{
			System.out.println(line);
		}

	}

	catch (Exception e) {
		e.printStackTrace();
	}

}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}