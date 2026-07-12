package com.kodewala.exception.handling.revision1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainReader { 
    public static void main(String[] args) { 

    	MainReader m = new MainReader();
    	m.fileread();
   
}
    public void fileread ()
    {
    	String fileName = "C:\\Users\\manmohan yadav\\OneDrive\\Desktop\\kodwala-coder\\Exception Handling\\src\\com\\kodewala\\exception\\handling\\day3\\Zepto.fileName";
    	
    	try
    	{
    		BufferedReader br = new BufferedReader (new java.io.FileReader(fileName));
    	String line;
    	while((line=br.readLine()) !=null)
{
	String lineArr[]=line.split(",");
	String branch = lineArr[2];
	if(branch.equals("Bengaluru Main"))
	{
		System.out.println(line);
	}
}
    	}catch(FileNotFoundException e)
    	{
    		e.printStackTrace();
    	}
    	catch(IOException e) 
    	{
    	e.printStackTrace();	
    	}
    }
}
