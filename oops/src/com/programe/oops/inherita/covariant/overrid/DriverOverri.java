package com.programe.oops.inherita.covariant.overrid;

public class DriverOverri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PaymentSystem obj = new UPI();

GenericResponse res = obj.doPayment("12345", 500, "tes");

System.out.println(res.message);
	}

}
