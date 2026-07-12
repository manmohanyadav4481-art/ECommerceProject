package com.kodewala.exception.handling.revision.dayy5;

import java.io.BufferedReader;

import java.io.FileReader;


public class Main1 implements AutoCloseable {

	public static void main(String[] args)  {
		
		try(BufferedReader b = new BufferedReader (
				new FileReader ("file path"));
	
				Main1 m = new Main1 ();
				{
					
			
			String line;
			while ((line = b.readLine()) !=null)
			{
				System.out.println(line);
			}
				
		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
