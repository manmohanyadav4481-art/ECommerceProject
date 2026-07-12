package com.kodewala.oops.revision;

class Student {
	void marks (int m1) {
		System.out.println("mark : "+m1);
	}
	void marks (int m1 , int m2 , int m3) {
	System.out.println("mark : "+m1);
	System.out.println("mark : "+m2);
	System.out.println("mark : "+m3);
	}
	void marks (int m2 , int m3) {
		System.out.println("mark : "+m2);
		System.out.println("mark : "+m3);
		
	}
}
public class Driver {
	public static void main (String [] args) {
	 Student s = new Student ();
	 s.marks(23);
	 s.marks(12, 20,40);
	 s.marks(1, 30);
	}
}