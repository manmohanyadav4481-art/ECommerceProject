package com.kodwala.interfa.day36.revision;
// class Cloneable interface
public  class Drivar implements Cloneable {
	String studentName;
	String studentId;
	int rollNumber;
	//contractor
	public Drivar(String studentName, String studentId, int rollNumber) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.rollNumber = rollNumber;
	}
	//clone method
	public Drivar clone() throws CloneNotSupportedException {
		return (Drivar) super.clone();
	}
//main method
	public static void main(String[] args)throws CloneNotSupportedException {
		Drivar d = new Drivar ("ManMohan" , "12k" , 123);
		//Cloneable
		Drivar d1 = d.clone();
		 System.out.println("Name"+d.studentName);
		 System.out.println("IdNum"+d.studentId);
		 System.out.println("RollNum"+d.rollNumber);
		 System.out.println("Name"+d1.studentName);
		 System.out.println("IdNum"+d1.studentId);
		 System.out.println("RollNum"+d1.rollNumber);
		 //instance rule
		 if(d instanceof Cloneable) 
		 {
			 System.out.println("D is Type of cloneable");
		 }else {
			 System.out.println("D is Not Cloneable");
		 }

	}

}
