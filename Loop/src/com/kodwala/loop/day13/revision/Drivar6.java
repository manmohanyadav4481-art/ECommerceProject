package com.kodwala.loop.day13.revision;

public class Drivar6 {

	public static void main(String[] args) {

	   Drivar6 d = new Drivar6 ();
	   d.check();
	}
	public void check ()
	{
		String name [] = {null, "mumbai", "delhi", "Lucknow",null, "kanpur", "jaunpur",null ," Noida"};
		
		for(int i=0; i<name.length; i++)
		{
			String element = name[i];
			
			if(element==null)
			{
				System.out.println("null index found in this method");
				return;
			}
			
		
			if(element.equalsIgnoreCase("delhi"))
			{
				System.out.println("delhi is part in the List");
				break;
			}
			
			
		}
		
		
	}
}
		
		

