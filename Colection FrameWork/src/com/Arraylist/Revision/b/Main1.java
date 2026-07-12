package com.Arraylist.Revision.b;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	
	int id;
	String name;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return id +""+name;


	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
}

public class Main1 {
	
	public static void main (String[]args) {
		ArrayList<Student>list =new ArrayList<>();
		
		list.add(new Student(3, "ram"));
		list.add(new Student(1, "maon"));
		list.add(new Student(2, "mannn"));
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
