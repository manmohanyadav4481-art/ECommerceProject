package com.javacode;

class Student {
	public Student (String name) {
		super();
		
	}
}

class StudentMgmt extends Student {
	
	int rollNo;
	String studentName;
	int num;
	String status;
	

	
	public StudentMgmt (int _rollNo, String _studentName, int _num) {
		
		this(_rollNo, _studentName, _num, "Pass");
	}

	public StudentMgmt(int _rollNo, String _studentName, int _num, String _status) {
		super ("Man name");
		this.rollNo = _rollNo;
		this.studentName = _studentName;
		this.num = _num;
		this.status = _status;
	}
}

public class Hello {
	public static void main (String [] args) {
		StudentMgmt s1 = new StudentMgmt (102, "Mohan", 5);

	System.out.println (s1.rollNo);
	System.out.println (s1.studentName);
	System.out.println (s1.num);
	System.out.println (s1.status);
	}

}
