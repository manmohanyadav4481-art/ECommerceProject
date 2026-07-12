package com.programe.oops.overloadin.inhirt;

class Student {
	public void go (String name , int rollnum) {
		System.out.println("Name : "+name);
		System.out.println("Rollnum : "+rollnum);
	}


	public void go (int numStudent , String nameStudent , int rollnum) {
		System.out.println("Total Student : "+numStudent );
		System.out.println("Student Name : "+nameStudent);
		System.out.println("RollNum :"+rollnum);
	}

	public void go (int enrollnum, String schoolename) {
		System.out.println("EnrollNum : "+enrollnum);
		System.out.println("SchoolName : "+schoolename);
	}
	
}

public abstract class Overloading {

	public static void main(String[] args) {
		Student s1 = new Student ();
		s1.go("Ram", 1223);
		s1.go(12, "RAja",12342);
		s1.go(21342, "K V Inter College Martinganj Azamgargh U.P");
		// TODO Auto-generated method stub

	}

}
