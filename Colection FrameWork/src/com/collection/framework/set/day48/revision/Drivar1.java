package com.collection.framework.set.day48.revision;

import java.util.HashSet;
import java.util.Set;

class Delivery 
{
	String iteam;
	
	public Delivery (String iteam)
	{
		super();
		this.iteam = iteam;
	}
	
	public boolean equals (Object obj)
	{
		Delivery d0 = (Delivery) obj;
		return this.iteam.equals(d0.iteam);
	}
	
	public int hashCode()
	{
		return this.iteam.hashCode();
	}
}

public class Drivar1 {

	public static void main(String[] args) {

		Set<String>product = new HashSet<String>();
		
		product.add("Clock");
		product.add("Mobile");
		product.add("HeadPhone");
		product.add("Shose");
		
		System.out.println(product.size());
		
		Set<Delivery>ride = new HashSet<Delivery>();
		
		Delivery d = new Delivery ("Bike");
		Delivery d1 = new Delivery ("Toy");
		Delivery d2 = new Delivery ("Book");
		Delivery d3 = new Delivery ("Bike");
		
		ride.add(d);
		ride.add(d1);
		ride.add(d2);
		ride.add(d3);
		
		System.out.println(ride.size());
		
		System.out.println(d.hashCode() +" : and : "+d3.hashCode() +" d and d3 is same index"+d.equals(d3));
		

	}

}
