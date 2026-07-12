package com.programe.oops.overloadin.pract;

class CulCulator {
	void add (int a , int b) {
		System.out.println("Sum : "+(a+b));
	}
	void add (int a, int b , int c) {
		System.out.println("Sum : "+(a+b+c));
	}
}


public class OvlAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CulCulator cul = new CulCulator ();
cul.add(12, 20);
cul.add(11, 10, 12);
	}

}
