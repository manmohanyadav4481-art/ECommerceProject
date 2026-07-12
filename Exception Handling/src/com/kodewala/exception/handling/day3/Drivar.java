package com.kodewala.exception.handling.day3;

public class Drivar {

	public static void main(String[] args) {
		{
			String name = "";
			
			System.out.println(name.length());//NPE-->unchecked/runtime Exception
		
			//checked exception
			
			try {
				Class.forName("com.kodewala.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}//forcing to handle it because ClassNotFoundException is checked exception
		
		}

	}

}
