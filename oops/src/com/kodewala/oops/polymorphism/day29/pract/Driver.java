package com.kodewala.oops.polymorphism.day29.pract;

public class Driver {

	public static void main(String[] args) {
		
		A obj = new B ();//upcasting 
		obj.show();
  B b = (B) obj;//down castin jvm cannot accept
  
	}

}
