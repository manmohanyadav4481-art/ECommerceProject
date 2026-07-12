package com.kodewala.exception.handling.revision1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Drivar1 {

	public static void main(String[] args) throws IOException {


		try
		{
			System.out.println("Try Start.....");
			
			BufferedReader br = new BufferedReader (
					new FileReader (
							"C:\\Users\\manmohan yadav\\OneDrive\\Desktop\\kodwala-coder\\Exception Handling\\src\\com\\kodewala\\exception\\handling\\revision1\\file.sale"));
			
			
		   String name = args[0];
		  // System.out.println(name);
		   br.close();
		   System.out.println("Drivar1.main() close...");
		   
		   System.out.println("Try is End .....");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Name is not Provided");
		}
		finally
		{
			System.out.println("Finally execute");
		}

	}

}
