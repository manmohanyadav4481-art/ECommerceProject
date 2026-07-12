package com.kodewala.exception.handling.revision.day5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main3 {

	public static void main(String[] args) 
	{
	
		System.out.println("Program Starting.........!");
		
		try(BufferedReader b = new BufferedReader (new FileReader("C:\\Users\\manmohan yadav\\OneDrive\\kodwala-coder\\Exception Handling\\src\\com\\kodewala\\exception\\handling\\revision\\day5\\File.txt"))){
			
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

	}


