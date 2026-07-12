package com.collection.framework.set.day46.revision;

import java.util.HashSet;

import java.util.Set;

class Name
{
    String name;
    
    Name (String name)
    {
    	this.name=name;
    }
	@Override
	public int hashCode()
	{
		return 12344;
	}

}
public class Drivar {

	public static void main (String[]args) {

		Set<Name>city = new HashSet<Name>(16);
		
		Name n = new Name ("Manmohan");
		Name n1 = new Name ("Manmohan");
		
		System.out.println(n.hashCode());
		System.out.println(n1.hashCode());
				
		System.out.println(n.hashCode() +"and"+n1.hashCode());
		
		city.add(n);
		city.add(n1);
		
		int hash ="n".hashCode();
		hash = hash^(hash >>> 16);
		
		int capacity =16;
		int bucketIndex =(capacity-1)& hash;
		
		System.out.println("HashCode : "+hash);
		System.out.println("bucketIndex : "+bucketIndex);
		
	}
}
