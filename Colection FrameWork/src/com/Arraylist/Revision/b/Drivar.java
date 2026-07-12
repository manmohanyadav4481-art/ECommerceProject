package com.Arraylist.Revision.b;

import java.util.LinkedList;

public class Drivar {

	public static void main(String[] args) {
		
		LinkedList<String>list = new LinkedList <String>();
		
		list.add("Jaipur");
		list.add("varanasi");
		list.add("Kanpur");
		list.add("Lucknow");
		
		System.out.println(list);
		
		list.add(2, "Prayagraj");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list.remove(1);
		
		System.out.println(list);
		
		for(int i =0; i<list.size(); i++)
		{
			String currentElement = list.get(i);
			if(currentElement.toUpperCase().startsWith("J"))
			{
				System.out.println(currentElement);
			}
			
		}

	}

}
