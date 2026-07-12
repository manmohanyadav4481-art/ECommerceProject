package com.kodewala.Array.day17;

class AccountInfo
{
	public void getCustomers ()
	{
		// get the customer's details whose account balance is -ve
		
		// created string array which will hold string objects.
		String customers[] = new String [5]; // string index = 0 to 4 
	
		// add an element
		
		customers [0] = "Rahul";
		customers [1] = "suraj";
		customers [2] = "shubham";
		customers [3] = "nabeel";
		customers [4] = "lokesh";
		
		
		// Accessing / reading an element from array
		String element = customers[2];
		
		
		System.out.println(element);
		
		// loop --> processing // biz logic
		for (int index=0; index <customers.length; index++)
		{
			String currentElement = customers[index];
			
			if (currentElement.startsWith("s"))
			{
				System.out.println(currentElement);
			}
		}
		
	}
}

public class Drivar {

	public static void main(String[] args) {
		
		 AccountInfo a = new  AccountInfo ();
		 a.getCustomers();

	}

}
