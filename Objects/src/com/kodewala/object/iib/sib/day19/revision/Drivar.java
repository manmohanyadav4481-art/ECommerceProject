package com.kodewala.object.iib.sib.day19.revision;

class StudentDetails {
	static int count =0;
	String studentName;
	int studentId;
	
	public StudentDetails (String _studentName, int _studentId ) {
		this.studentName = _studentName;
		this.studentId = _studentId;
	}
	{
		count++;
		System.out.println("TCS EMPLOYEE : "+count);
	}
}

public class Drivar {

	public static void main(String[] args) {
		
		StudentDetails s = new StudentDetails ("Manmohan : ", 12);
		StudentDetails s1 = new StudentDetails ("Sanoj : ", 120);
		StudentDetails s2 = new StudentDetails ("Ram : ", 120);
		
		System.out.println("EmployeeName : "+s.studentName +"EmployeeId : "+s.studentId);
		System.out.println("EmployeeName : "+s1.studentName +"EmployeeId : "+s.studentId);
		System.out.println("EmployeeName : "+s2.studentName +"EmployeeId : "+s.studentId);
		

	}

}
