package com.collection.framework.set.day47;
// this is not maintance the override equals method
class Person2 
{
	String firstName;
	String lastName;
	public Person2 (String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
}

public class Drivar1 {

	public static void main(String[] args) {

	Person2 p1 = new Person2 ("Ajay", "Kumar");
	Person2 p2 = new Person2 ("Ajay", "kumar");
	
	System.out.println(p1.equals(p2));

		

	}

}
