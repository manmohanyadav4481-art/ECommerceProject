package com.kodewala.exception.handling.day4;
import java.io.BufferedReader;
import java.io.FileReader;


public class Drivar3 {

	public static void main(String[] args) {

		try
		{
			System.out.println("Try Start.....");
			BufferedReader br = new BufferedReader (
					new FileReader(
							"C:\\Users\\manmohan yadav\\OneDrive\\Desktop\\kodwala-coder\\Exception Handling\\src\\com\\kodewala\\exception\\handling\\day4\\file.in"));
			
			String name = args[0]; // this code may throw exception...
			//System.out.println(name);
			br.close();//closing the file connection
			System.out.println("Driver.main()---try end----");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.err.println("Name is not provided...");
		}
		catch (Exception e)
		{
			e .printStackTrace();
			System.out.println("some other problem");
			
		}
		finally
		{
			//mandatory executable block
			System.out.println("Drivar3.main() finally ----");
		}

	}

}



