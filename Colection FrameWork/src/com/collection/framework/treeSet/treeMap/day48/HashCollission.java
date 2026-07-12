package com.collection.framework.treeSet.treeMap.day48;



import java.util.HashSet;
import java.util.Set;

class Student
{
	String name;

	Student(String name)
	{
		this.name = name;
	}

	public int hashCode()
	{
		return 1234;
	}
}

public class HashCollission
{
	public static void main(String[] args)
	{
		Student s1=new Student("Durga Prasad");
		Student s2=new Student("Durga Prasad");
		Student s3=new Student("Durga Prasad");
		Student s4=new Student("Durga Prasad");
		Student s5=new Student("Durga Prasad");
		Student s6=new Student("Durga Prasad");
		Student s7=new Student("Durga Prasad");
		Student s8=new Student("Durga Prasad");
		Student s9=new Student("Durga Prasad");
		
		Set<Student> set=new HashSet<Student>(64);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s7);
		set.add(s8);
		
		System.out.println(set.size());
		
		set.add(s9);//Tree added
		
		System.out.println(set.size());
		
		set.remove(s9);
		set.remove(s8);
		set.remove(s7);
		set.remove(s6);
		set.remove(s5);
		set.remove(s4);//tree remove
		set.remove(s3);
		System.out.println(set.size());
		
	}
}
