package com.programe.oops.inherita.overrid.practt;

public class DriverOvri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b = new SBI();
Account acc = b.openAccount();
System.out.println(acc.type);
	}

}
