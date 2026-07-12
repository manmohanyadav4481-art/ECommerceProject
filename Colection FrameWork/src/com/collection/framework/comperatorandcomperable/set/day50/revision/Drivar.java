package com.collection.framework.comperatorandcomperable.set.day50.revision;

import java.util.TreeSet;

class Student implements Comparable<Student> 
{
	int salary;
	String name;
	
	public Student ( int _salary , String _name) {
		super();
		this.name= _name;
		this.salary= _salary;
	}

	@Override
	public int compareTo(Student o) {
		
		return (this.salary-o.salary);
	}
}

public class Drivar {
	public static void main (String[] args) {
		
		Student s = new Student(1300, "man");
		Student s1 = new Student (4500, "ram");
		
		TreeSet<Student>set =new TreeSet<Student>();
		
		set.add(s);
		set.add(s1);
		
		for(Student s2 : set)
		
		System.out.println(s2.salary +" : "+s2.salary);
	}
}