package com.programe.oops.overloadin.pract;

class Student {
	void marks (int m1) {
		System.out.println("Mark : "+m1);
	}
	void marks (int m1, int m2) {
		System.out.println("Total : "+(m1+m2));
	}
	void marks (int m1, int m2, int m3) {
		System.out.println("Total : "+(m1+m2+m3));
	}
}

public class StudentAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student ();
		s.marks(50);
		s.marks(60, 70);
		s.marks(45, 60, 70);

	}

}
