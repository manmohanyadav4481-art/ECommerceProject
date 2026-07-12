package com.kodewala.object.iib.sib.day19;

class EmployeeDetails {
	static int count=0;
	String employeeName;
	int employeeId;
	
	public EmployeeDetails(String employeeName, int employeeId) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}
	{
		count++;
		System.out.println("Kodewala : "+count);
	}
}

public class Drivar0 {

	public static void main(String[] args) {
		
		 EmployeeDetails e = new  EmployeeDetails ("Neha", 231);
		 EmployeeDetails e1 =new  EmployeeDetails ("Pooja", 121);
		 
		 System.out.println("Employee name : "+e.employeeName +" Employee id : "+e.employeeId);
		 System.out.println("Employee name : "+e1.employeeName +" Employee id : "+e.employeeId);
	}

}
