package com.Arraylist.Revision;

import java.util.ArrayList;

public class DrivarIDFC {
	
	public static void main (String [] args) {
		
		// create the ArrayList and Store element 

		ArrayList<IDFCuser>defaultList =new ArrayList<IDFCuser>();
		
		IDFCuser u = new IDFCuser ("Man", "sbi","mum",1200);
		IDFCuser u0 = new IDFCuser ("Manm", "sbi","BNR",200);
		IDFCuser u1 = new IDFCuser ("Mana", "sbi","UK",1000);
		IDFCuser u2 = new IDFCuser ("Manv", "sbi","Lkn",400);
		IDFCuser u3 = new IDFCuser ("Manb", "sbi","DLE",800);
		
		
		defaultList.add(u);
		defaultList.add(u0);
		defaultList.add(u1);
		defaultList.add(u2);
		defaultList.add(u3);
		
		for(int i=0; i<defaultList.size(); i++)
		{
			IDFCuser us = defaultList.get(i);
			
			if(us.getBalance()<1000)
			{
				System.out.println("Send Email to user : "+us.getName()+" : Balance is not maintance");
			}
		}

	}

}
