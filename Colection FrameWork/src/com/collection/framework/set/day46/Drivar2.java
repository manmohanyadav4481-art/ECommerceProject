package com.collection.framework.set.day46;

class Person
{
	
}

public class Drivar2 {

	public static void main(String[] args) {
	

		Person p = new Person ();
		Person p1 = new Person ();
		System.out.println(p.hashCode());  //366712642
		System.out.println(p1.hashCode());
		
		String s1 =  "Academy";
		String s2 = "Academy";
		System.out.println(s1.hashCode()); //485144268  0 to n --> 5th
		System.out.println(s2.hashCode()); //485144268 0 to n --> 5th
		
	}

}
