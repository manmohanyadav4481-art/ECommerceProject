package com.collection.framework.set.treehashset.day49.revision;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Student
{
	String name;
	Student(String name)
	{
		this.name=name;
	}
	
	public boolean equals (Object obj)
	{
		Student ee = (Student) obj;
		return this.name.equals(ee.name);
	}
	public int hashCode ()
	{
		return this.name.hashCode();
	}
}

public class Drivar {

	public static void main(String[] args) {

		Set<String>list = new HashSet<String>();
		
		list.add("Ratan");
		list.add("mohan");
		list.add("RadhMohan");
		list.add("Shivam");
		
		System.out.println(list.size());
		
		Set<Student>count = new HashSet<Student>();
		
		Student s = new Student ("Rajbhar");
		Student s1 = new Student ("Radh");
		Student s2 = new Student ("RadhKrishan");
		
		count.add(s);
		count.add(s1);
		count.add(s2);
		
		System.out.println(count.size());
		
		Student s3 = new Student ("Shiva");
		Student s4 = new Student ("Sohan");
		Student s5 = new Student ("Radh");
		
		count.add(s3);
		count.add(s4);
		System.out.println(count.size());
		
		count.remove(s1);
		count.remove(s3);
		count.add(s5);
		
		System.out.println(s5.hashCode() +" : "+ s1.hashCode());
		
		System.out.println(count.size());

	}	
	}


