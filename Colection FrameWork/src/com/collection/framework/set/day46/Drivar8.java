package com.collection.framework.set.day46;

import java.util.HashSet;
import java.util.Set; 

class Employee 
{
	@Override
	public int hashCode()  // this is call first class method
	{
		return 1232223; // i am forceing 
	}
}

public class Drivar8 {

	public static void main(String[] args) {
		
		Set<Employee>city = new HashSet <Employee>(16);
		
		Employee em = new Employee();
		Employee em2 = new Employee(); // it will be same hashcode
		
		System.out.println(em.hashCode()+"and"+em2.hashCode());

		
		
	}

}
