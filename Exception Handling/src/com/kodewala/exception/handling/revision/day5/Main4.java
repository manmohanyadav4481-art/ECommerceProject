package com.kodewala.exception.handling.revision.day5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main4 implements AutoCloseable
{

	public static void main(String[] args) 
	{
		
	System.out.println("Program  is Starting .......!");
	
	try(BufferedReader b = new BufferedReader (new FileReader("file path"));
			
			Main4 m = new Main4 ();
			
			)
	
	{
		String line;
		while((line = b.readLine()) !=null)
		{
			System.out.println(line);
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	}


