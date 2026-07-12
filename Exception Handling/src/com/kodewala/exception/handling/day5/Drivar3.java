package com.kodewala.exception.handling.day5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Drivar3 {

	public static void main(String[] args)

	{

		System.out.println("Driver .main");

		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\manmohan yadav\\OneDrive\\Desktop\\kodwala-coder\\Exception Handling\\src\\com\\kodewala\\exception\\handling\\day5\\test.txt"));) {
		
			
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

}
