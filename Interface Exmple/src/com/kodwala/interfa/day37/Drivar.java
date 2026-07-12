package com.kodwala.interfa.day37;

public class Drivar {
	String name;
	
	Drivar(String d){
		this.name = d;
	}
	public Drivar clone() throws CloneNotSupportedException {
		return (Drivar) clone ();
	}
	public static void main (String []args) throws CloneNotSupportedException {
		Drivar d = new Drivar ("manmohan");
		
		Drivar d1 = d.clone();
				System.out.println("d"+d.name); System.out.println("d"+d1.name);
		
		if (d instanceof Cloneable) {
			System.out.println("d is instance cloneable object");
		}else {
			System.out.println("d is not cloneable ");
		}
	}
}
