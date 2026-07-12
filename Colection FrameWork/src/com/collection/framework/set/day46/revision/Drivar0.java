package com.collection.framework.set.day46.revision;

import java.util.HashSet;
import java.util.Set;

class Person
{
	@Override
	public int hashCode()
	{
		return 345242;
	}
}

public class Drivar0 {

	public static void main(String[] args) {
	
		Set<Person>city = new HashSet<Person>(16);
		Person p1 = new Person ();
		Person p2 =new Person ();
		
		System.out.println(p1.hashCode()+"  and  "+p2.hashCode());

		city.add(p1);
		city.add(p2);
		
		int hash = "p1".hashCode();
		 hash = hash ^ (hash >>> 16);

		int capacity = 16; // default initial capacity
		int bucketIndex = (capacity - 1) & hash;

		System.out.println("HashCode = " + hash);
		System.out.println("p1 store at Index = " + bucketIndex);
		
		System.out.println(city);
	}

}
