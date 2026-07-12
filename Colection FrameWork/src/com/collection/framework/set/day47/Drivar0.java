package com.collection.framework.set.day47;
 
      // we call they equals methods

class Person1 
{
	String firstName;
	String lastName;
	public Person1 (String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}

public class Drivar0 {

	public static void main(String[] args) {

		Person1 p1 = new Person1 ("Ajay", "Kumar");
		Person1 p2 = new Person1 ("vjay", "Kumar");
		
		System.out.println(p1.equals(p2));

		
	}

}
