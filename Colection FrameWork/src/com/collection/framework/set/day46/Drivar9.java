package com.collection.framework.set.day46;
import java.util.HashSet;
import java.util.Set; 

class Employe 
{
	@Override
	public int hashCode()
	{
		return 1232223;
	}
}

public class Drivar9 {

	public static void main(String[] args) {
		
		Set<Employee>emps = new HashSet <Employee>(16);
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		System.out.println(employee1.hashCode()+"and"+employee2.hashCode());

		emps.add(employee1);
		emps.add(employee2);
		
		int hash = "ememployee1".hashCode();
		 hash = hash ^ (hash >>> 16);

		int capacity = 16; // default initial capacity
		int bucketIndex = (capacity - 1) & hash;

		System.out.println("HashCode = " + hash);
		System.out.println("employee1 store at Index = " + bucketIndex);
		
		// two object add you debug check
		
	}

}