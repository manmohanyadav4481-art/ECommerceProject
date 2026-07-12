package com.collection.framework.treeSet.treeMap.day48;

import java.util.HashSet;
import java.util.Set;

class Student2
{
	String name;
	
	Student2 (String name)
	{
		this.name = name;
	}
}

public class Drivar1 {

	public static void main(String[] args) {
		
		Student2 s1 = new Student2 ("Manmohan");
		Student2 s2 = new Student2 ("Priya");
		Student2 s3 = new Student2 ("Sandeep");
		Student2 s4 = new Student2 ("Kundan");
		Student2 s5 = new Student2 ("Amit");
		
		Set<Student2> name = new HashSet<Student2>();
		
		
		name.add(s1);
		name.add(s2);
		name.add(s3);
		name.add(s4);
		name.add(s5);
		
		System.out.println(name.size());
		
		name.remove(s5);
		name.remove(s4);
		
		System.out.println(name.size());
		

	}

}
