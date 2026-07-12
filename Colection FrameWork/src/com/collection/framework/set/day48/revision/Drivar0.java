package com.collection.framework.set.day48.revision;

import java.util.HashSet;
import java.util.Set;

class Student
{
	String name;
	
	public Student (String name) 
	{
	    super();
	    this.name = name;
	}
}

public class Drivar0 {

	public static void main(String[] args) {

		Set<String>name = new HashSet<String>();
		
		name.add("Ravi");
		name.add("Manoj");
		name.add("Suraj");
		name.add("Pawar");
		
		System.out.println(name.size());

     Set<Student>check = new HashSet<Student>();
     
     Student s = new Student ("Ajeet");
     Student s1 = new Student ("Priya");
     Student s2 = new Student ("Mohan");
     Student s3 = new Student ("Ajeet");
     
     check.add(s);
     check.add(s1);
     check.add(s2);
     check.add(s3);
     
     System.out.println(check.size());
     
     System.out.println(s.hashCode()+" : "+s3.hashCode());
     
     
	}

}
