package com.collection.framework.set.day47;

class Person
{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public int hashCode()
	{
		return 4323556;
	}
}
public class Drivar {

	public static void main(String[] args) {

        // Contract #1 : if two objects are equal then hash code must be same
		
		String s1 = "Kodewala";
		String s2 = "Kodewala";
		
		System.out.println(s1.hashCode()+" and "+s2.hashCode());
		
		// Contract #2 : If two objects return same hash code , obeject may or may not be 
		// equal.
		
		Person p1 = new Person ("Ram");
		Person p2 = new Person ("Mohan");
		
		System.out.println(p1.hashCode()+" and "+p2.hashCode() +" Is p1 and p2 not equals ?"+p1.equals(p2) );
		
	
		
		
		
	}

}
