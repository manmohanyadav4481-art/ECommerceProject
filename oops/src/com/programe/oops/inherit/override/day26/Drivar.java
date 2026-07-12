package com.programe.oops.inherit.override.day26;

class Employee {
	public void saySomthing()
	{
		System.out.println("Hello");
	}
}
class Manager extends Employee
{
	public void saySomthing () {
		System.out.println("Hy Bro !!!!");
	}
}

public class Drivar {

	public static void main(String[] args) {

		Manager m = new Manager ();
		m.saySomthing();

	}

}
