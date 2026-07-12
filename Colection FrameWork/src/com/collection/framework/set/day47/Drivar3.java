package com.collection.framework.set.day47;

// this is the maintance Override the equals method

class Person4
{
	String firstName;
	String lastName;
	public Person4(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object objt2)
	{
		Person4 p = (Person4) objt2;
		return this.firstName.equals(p.firstName) & this.lastName.equals(p.lastName);
	}
}




public class Drivar3 {

	public static void main(String[] args) {

		Person4 p1 = new Person4 ("Ajay", "Kumar");
		Person4 p2 = new Person4 ("Vijay", "Kumar");
		
    System.out.println(p1.equals(p2));
	}

}
