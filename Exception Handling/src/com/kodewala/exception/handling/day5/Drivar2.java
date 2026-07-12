package com.kodewala.exception.handling.day5;

import java.io.BufferedReader;
import java.io.FileReader;


public class Drivar2 {

	public static void main(String[] args) {

		try
		(BufferedReader br = new BufferedReader 
		(new FileReader(
				"C:\\Users\\manmohan yadav\\OneDrive\\Desktop\\kodwala-coder\\Exception Handling\\src\\com\\kodewala\\exception\\handling\\day5\\test.txt"));) 
		// java 7/1.7
		        
		{
			//risky
			//open the connection (db,file etc)
			//20 line closing the connection
		}
		catch (Exception  e)
		{
			e.printStackTrace();
			//handle -->closing part
		}
		finally
		{
			//cleanup  // br.close
		}
	}

}
