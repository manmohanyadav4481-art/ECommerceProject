package com.kodwala.interfa.day37.revision;

class Student {
	String name;
	String collegeName;
	int rollNum;
	
 public	Student(String name, String collegeName, int rollNum){
		super();
		this.name = name;
		this.collegeName = collegeName;
		this.rollNum = rollNum;
	}
    class DataOfStudent{
	public void studentDetails (Object obj) {
		if (obj instanceof StudentDetailsable)
		{
			Student st = (Student)obj;
			System.out.println("NameOfStudent : "+st.name);
			System.out.println("CollegeName : "+st.collegeName);
			System.out.println("StudentRollNum : "+st.rollNum);
		}else
		{
			System.out.println("Print Of Data Student Exception..");
		}
	}
}
}

public  class Drivar {
	public static void main (String[]args) {
		Student st = new Student ("Manmohan", "KV Inter", 232);
		
		Student.DataOfStudent d = st.new DataOfStudent ();
		d.studentDetails(st);
	}


	}


