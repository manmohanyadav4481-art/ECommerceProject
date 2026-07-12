package com.collection.framework.set.day48.revision;

import java.util.HashSet;
import java.util.Set;

class Delivary
{
	String iteam;

Delivary (String iteam)
{
	this.iteam= iteam;
}
public int hasCode ()
{
	return 1234;
}

}
public class Drivar3 {

	public static void main(String[] args) {
	
		Set<Delivary>iteam1 = new HashSet<Delivary>(32);
		
		iteam1.add(new Delivary ("Mobile"));
		iteam1.add(new Delivary ("HeadPhone"));
		iteam1.add(new Delivary ("Pen"));
		iteam1.add(new Delivary ("Book"));
		
		System.out.println(iteam1.size());
		
	}

}
