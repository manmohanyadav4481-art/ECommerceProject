package com.kodewala.exception.handling.revision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Drivar {

	public static void main(String[] args) {
		Drivar d = new Drivar ();
		d.bilgenrate();

		
	}
	public void bilgenrate()
	{
		String fileName = "C:\\Users\\manmohan yadav\\OneDrive\\Desktop\\kodwala-coder\\Exception Handling\\src\\com\\kodewala\\exception\\handling\\revision\\Bill.generate";
	try
	{
		BufferedReader b = new BufferedReader (new java.io.FileReader(fileName));
		String line;
		while((line=b.readLine()) !=null)
		{
			String lineArr[]=line.split(",");
			String salary =lineArr[2];
			if(salary.equals("55000"))
			System.out.println(line);
		}
		
	}catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}catch(IOException e)
	{
		e.printStackTrace();
	}
	}
}

		


		
		
