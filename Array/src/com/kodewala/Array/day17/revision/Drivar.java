package com.kodewala.Array.day17.revision;

class Bank
{
	public void pay ()
	{
		// add element 
		
		String amount[] = new String [4];
		
		amount [0] = "1200";
		amount [1] = "500";
		amount [2] = "5000";
		amount [3] = "400";
		
		String element = amount [2];
		System.out.println(element);
	
		//loop
	
		for(int index=0; index<amount.length; index++)
		{
			String currentElement =  amount [index];
			
			if (currentElement.startsWith("5"))
			{
				System.out.println(currentElement);
			}
		}
	}
}

public class Drivar {

	public static void main(String[] args) {
		
		Bank a = new Bank ();
		a.pay();
		
	

	}

}
