package com.programe.oops;

abstract class Vehicle {
	abstract void start ();
	
	void stop () {
		System.out.println("Vehicle Stopped");
	}
}

class Car extends Vehicle {
	void start () {
		System.out.println("Car Starts With Key");
	}
}

class Person {
	private String name;
	
	public void setName(String name) {
    this.name = name;	
}
 
public String getName () {
	return name;
}

}

class Employee extends Person {
	void Work () {
		System.out.println(getName() + " Is Working IT Sector");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Car ();
		v.start();
		v.stop();
Employee e = new Employee ();
e.setName("Rahul");
e.Work();
	}

}
