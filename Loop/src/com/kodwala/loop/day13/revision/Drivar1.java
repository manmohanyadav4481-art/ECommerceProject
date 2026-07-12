package com.kodwala.loop.day13.revision;

public class Drivar1 {

	public static void main(String[] args) {

		Drivar1 d = new Drivar1();
		d.checkAttendence();
		
	}
	
	public void checkAttendence ()
	{
		String student [] = {"Ravi", "Amit", "Sunil", "shani" , "Ajeet"};
		
		for(int index=0; index<student.length; index++)
		{
			String element = student[index];
			
			if(element.equalsIgnoreCase("Ravi"))
			{
			   System.out.println("Ravi is part of list");
				
			}
		}
	}

	}


