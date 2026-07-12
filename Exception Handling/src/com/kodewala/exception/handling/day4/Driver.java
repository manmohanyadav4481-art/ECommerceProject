package com.kodewala.exception.handling.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br =null;
		try
	{
		System.out.println("Try Start");
		
		br = new BufferedReader (
				new FileReader(
"C:\\Users\\manmohan yadav\\OneDrive\\Desktop\\kodwala-coder\\Exception Handling\\src\\com\\kodewala\\exception\\handling\\day4\\file.in"));


		
		String name = args[0];
		{
		System.out.println("Drivar.main() ---Try end.....");
	}
	
	}catch(ArrayIndexOutOfBoundsException e)
		{
		e.printStackTrace();
		System.err.println("Name is nat provided ...");
		
		}
	
		finally
		{
			br.close();
			System.out.println("Driver.finally b");
	}
}
}
