package com.kodewala.exception.handling.revision1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Drivar5 {

	public static void main(String[] args) {


		try
		{
			BufferedReader br = new BufferedReader (
					new FileReader(
							"C:\\Users\\manmohan yadav\\OneDrive\\Desktop\\kodwala-coder\\Exception Handling\\src\\com\\kodewala\\exception\\handling\\revision1\\file.sale"));
			System.out.println("Start Try........!");
			
			String productName=args[0];
			
			br.close();
			
			System.out.println("End Try............");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Some Other Problem......!");
		}

	}

}
