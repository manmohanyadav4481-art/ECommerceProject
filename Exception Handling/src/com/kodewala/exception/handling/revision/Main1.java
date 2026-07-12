package com.kodewala.exception.handling.revision;

import java.io.FileNotFoundException;

public class Main1 {

	public static void main(String[] args) {
	
     String  name = "";
     
     System.out.println(name.length());
     
     try
     {
    	 Class.forName("com.kodewala.main");
    	 
     }catch (ClassNotFoundException e)
     {
    	    e.printStackTrace();
     
     }
	}

}
