package com.programe.oops.mult.inhirt;

class College {
	public void go () {
		System.out.println("go College");
	}
}
class School extends College {
	public void go () {
		System.out.println("go School ");
	}
}
class PreSchool extends School {
	public void go () {
		System.out.println("go PreSchool");
	}
}
class EnglighSchool extends PreSchool {
 public void go () {
	 System.out.println("go English School");
	 
 }
}