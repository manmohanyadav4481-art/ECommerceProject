package com.Arraylist.Revision.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	int salary;
	String name;
	
	Employee(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}
	public String toString() {
		return salary +""+name;
	}
}

public class Main5 {

	public static void main(String[] args) {
		
         ArrayList<Employee>list = new ArrayList<>();
         
         list.add(new Employee(50000, "A"));
         list.add(new Employee (4300, "pay"));
         list.add(new Employee(4000,"pay"));
	
         
         Collections.sort(list, new Comparator <Employee>() {
        	 public int compare (Employee e1,Employee e2) {
        	  return e1.salary-e2.salary;
        	 }
         });
         System.out.println(list);
	}

}
