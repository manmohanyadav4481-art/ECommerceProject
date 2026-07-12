package com.collection.framework.set.day47;

// this is not  maintance the contract . object same and hashcode will be same

class Person5
{
	String firstName;
	String lastName;
	
	public Person5(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
  
	@Override
      public boolean equals(Object objt2)
	   {
		   Person5 p3 = (Person5) objt2;
		   return this.firstName.equals(p3.firstName) & this.lastName.equals(p3.lastName);
	   }
   }
	

public class Drivar4 {

	public static void main(String[] args) {


		Person5 p1 = new Person5 ("Ajay", "Kumar");
		Person5 p2 = new Person5 ("Ajay", "Kumar");
		
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode() +" and "+ p2.hashCode());
	}

}
