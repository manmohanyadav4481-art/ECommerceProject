package com.kodewala.object.iib.sib.day19.revision;

class StudentDetailss {
	static int counter =0;
	String studentName;
	int studentId;
	
	{
		counter = counter +1;
	}
	{
		System.out.println("StudentDetails.enclosing_method()");
	}
	{
		counter = counter +1;
	}
	public StudentDetailss (String _studentName, int _studentId) {
		this.studentName = _studentName;
		this.studentId = _studentId;
	}
}
public class Drivar0 {

	public static void main (String[]args) {
		
		StudentDetailss p = new StudentDetailss ("Ram ", 12);
		StudentDetailss p1 = new StudentDetailss ("Raj ", 12);
		StudentDetailss p2 = new StudentDetailss ("Ra ", 12);
		
		System.out.println(p.studentName +"_"+p.studentId);
		System.out.println(p1.studentName +"_"+p1.studentId);
		System.out.println(p2.studentName +"_"+p2.studentId);
	}


}
