package com.kodewala.exception.handling.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ZeptoReader {

	public static void main(String[] args) {
		ZeptoReader z = new ZeptoReader ();
		z.recipetbill();
	}

	public void recipetbill() {

		String fileName = "C:\\Users\\manmohan yadav\\OneDrive\\Desktop\\kodwala-coder\\Exception Handling\\src\\com\\kodewala\\exception\\handling\\day3\\Paid.bill";

		try {
			BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
			String line;
			while ((line = br.readLine()) !=null)
			{
			
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
