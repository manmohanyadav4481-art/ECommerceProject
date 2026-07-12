package com.Arraylist.Revision.b;

import java.util.ArrayList;

public class Drivar1 {

	public static void main(String[] args) {
		
		ArrayList<Hdefcuser1>defaultList = new ArrayList <Hdefcuser1>();
		
		Hdefcuser1 us = new Hdefcuser1 (" Manmohan : ", "sbi", "mumbai", 100);
		Hdefcuser1 us1 = new Hdefcuser1 (" amit : ", "sbi", "Bengalore", 1100);
		Hdefcuser1 us2 = new Hdefcuser1 (" Raj : ", "sbi", "Lucknow", 1000);
		Hdefcuser1 us3 = new Hdefcuser1 (" Ram : ", "sbi", "Varanasi", 800);
		
		
		defaultList.add(us);
		defaultList.add(us1);
		defaultList.add(us2);
		defaultList.add(us3);
		
		for (int i=0; i <defaultList.size(); i++)
		{
			Hdefcuser1 u = defaultList.get(i);
			if(u.getBalance()<1000)
			{
				System.out.println("Please Send the Email : "+u.getName()+" Please maintance the balance");
			}
		}
	}

}
