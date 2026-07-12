package com.kodewala.exception.handling.revision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {
		FileReader f = new FileReader ();
		f.readfile();

	}
	public void readfile()
	{
		String fileName ="C:\\Users\\manmohan yadav\\OneDrive\\Desktop\\kodwala-coder\\Exception Handling\\src\\com\\kodewala\\exception\\handling\\revision\\sale.billfile";
		try
		{
		BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
		String line;
		while((line= br.readLine()) !=null)
		{
			/*
			String lineArr[] = line.split(",");
			String city = lineArr[2];
			if (city.equals("Ahmedabad"))
			{
			*/
			System.out.println(line);
			}
			
			
	//	}
	
		
		}
		catch(FileNotFoundException e)
	{
		e.printStackTrace();
	
	
	}catch(IOException e)
	{
		e.printStackTrace();
	}

		}
}

