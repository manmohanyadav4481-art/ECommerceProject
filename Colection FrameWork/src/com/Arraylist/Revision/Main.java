package com.Arraylist.Revision;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// create ArrayList and store element
		
		ArrayList<String>citeys = new ArrayList<String>();
	
		// add element 
		
		citeys.add("Knp");
		citeys.add("vns");
		citeys.add("Nod");
		citeys.add("lkn");
		citeys.add("amg");
		citeys.add("Knp");
		citeys.add("vns");
		citeys.add("Nod");
		citeys.add("lkn");
		citeys.add("amg");
		
		System.out.println(citeys.get(0));
		
		citeys.add(2, "jhansi");
		
		System.out.println(citeys);
		
		citeys.remove(4);
		
		System.out.println(citeys);
		
		System.out.println(citeys);

		for(int i=0; i<citeys.size(); i++)
		{
			String currentElement =citeys.get(i);
			if(currentElement.toLowerCase().startsWith("a"))
			{
				System.out.println(currentElement);
			}


		}
	
	}
}