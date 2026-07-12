package com.collection.framework.set.day47;

// this is maintance the Override the equals method

class Person3
{
	String firstName;
	String lastName;
	public Person3(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public boolean equals(Object objt2)
	{
		//downcasting // campare the content
		Person3 e2 = (Person3) objt2;
		return this.firstName.equals(e2.firstName) & this.lastName.equals(e2.lastName);
	}
	
}

public class Drivar2 {

	public static void main(String[] args) {
		
		Person3 p1 = new Person3 ("Ajay", "Kumar");
		Person3 p2 = new Person3 ("Ajay", "Kumar");
		
		System.out.println(p1.equals(p2));

	}

}
