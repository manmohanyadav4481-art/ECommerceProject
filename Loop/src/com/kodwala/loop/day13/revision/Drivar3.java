package com.kodwala.loop.day13.revision;

public class Drivar3 {

	public static void main(String[]args) {
		
		Drivar3 d = new Drivar3();
		d.checkStudentName();
	}
	
	public void checkStudentName()
	{
		String name [] = {"Ravi", "amit", "raj", "Durga", "ritesh", "Suraj", "Sonu", "Manmohan", "Neeraj"};
		{
			for(int index=0; index<name.length; index++)
			{
				String element = name[index];
				
				if (element.equalsIgnoreCase("raj")) 
				{
					continue;
				}
				{
					System.out.println(element.toUpperCase());
				}
			}
		}
		
	}
	
	
}
