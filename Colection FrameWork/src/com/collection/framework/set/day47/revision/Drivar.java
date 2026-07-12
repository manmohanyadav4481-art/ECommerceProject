package com.collection.framework.set.day47.revision;

class Person
{
	String firstName;
	String secoundName;
	
	public Person (String firstName, String secoundName)
	{
		super();
		this.firstName =firstName;
		this.secoundName = secoundName;
	}
	@Override
    public boolean equals (Object obj)
    {
    	Person e =  (Person) obj;
    	return this.firstName.equals(e.firstName) & this.secoundName.equals(e.secoundName);
    }
    @Override
    public int hashCode ()
    {
    	return this.firstName.hashCode()  + this.secoundName.hashCode();
    }
	

}

public class Drivar {

	public static void main(String[] args) {
		
		Person p = new Person ("Ajay", "Kumar");
		Person p1 = new Person ("Ajay", "Kumar");
		
		System.out.println(p.equals(p1));
		
		System.out.println(p.hashCode() +" : and : "+p1.hashCode());
		

	}

}
