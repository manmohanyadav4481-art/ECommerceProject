package com.collection.framework.set.day47;

// this is   maintance the contract. object same and hashcode will be same


class Employee
{
	String firstName;
	String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object objt2)
	{
		Employee e2 = (Employee) objt2;
		return this.firstName.equals(e2.firstName) & this.lastName.equals(e2.lastName);
	}
	// override hashcode
	@Override
	public int hashCode()
	{
		return this.firstName.hashCode()+this.lastName.hashCode();
	}
}

public class Drivar5 {

	public static void main(String[] args) {

		Employee e1 = new Employee ("Sonu", "Yadav");
		Employee e2 = new Employee ("Sonu", "Yadav");
		
		System.out.println(e1.equals(e2)); // true
        System.out.println(e1.hashCode()+" and "+e2.hashCode());
		

	}

}
