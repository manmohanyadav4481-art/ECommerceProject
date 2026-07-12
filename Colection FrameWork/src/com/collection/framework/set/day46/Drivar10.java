package com.collection.framework.set.day46;

import java.util.HashSet;
import java.util.Set; 

class Employee1
{
	String name;
	
	public Employee1(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode()
	{
		return 1232223;
	}
}

public class Drivar10 {

	public static void main(String[] args) {
		
		Set<Employee1>emps = new HashSet <Employee1>(16);
		
		Employee1 employee1 = new Employee1("Kodewala");
		Employee1 employee2 = new Employee1("Academy");
		
		System.out.println(employee1.hashCode()+"and"+employee2.hashCode());

		emps.add(employee1);
		emps.add(employee2);
		
		int hash = "ememployee1".hashCode();
		 hash = hash ^ (hash >>> 16);

		int capacity = 16; // default initial capacity
		int bucketIndex = (capacity - 1) & hash;

		System.out.println("HashCode = " + hash);
		System.out.println("employee1 store at Index = " + bucketIndex);
		
		// two deffirant  object of same hashcode add you debug check bucket number 13
		// they call is equal method // one more existing to node/ hashnode is call linked
		System.out.println(emps.size());
	}

}