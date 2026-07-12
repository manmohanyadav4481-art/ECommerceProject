package com.kodewala.objects3.day15;

class Payment {
	
	int amount;
	String upiId;
	String note;
	String bank;
	String name;
	String mobileNumber;
	
	
	public Payment (int _amount , String _upiId) {
	
		this.amount = _amount;
		this.upiId = _upiId;
	}

public Payment (int _amount, String _upiId, String _note) {
	
	this.amount = _amount;
	this.upiId = _upiId;
	this.note = _note;
}
public Payment (int _amount , String _mobileNumber , String _name, String _bank) {
	
	this.amount = _amount;
	this.mobileNumber = _mobileNumber;
	this.bank = _bank;
	this.name = _name;
	
}
}
public class Drivar {

	public static void main(String[] args) {

	Payment pa = new Payment (1200, "abscd@sbi");
	Payment pa1 = new Payment (1200, "abscd@sbi", "nate");

	Payment pa2 = new Payment (1200, "7021339803", "manmohan", "sbi");

	System.out.println(pa);
	System.out.println(pa1);
	System.out.println(pa2);

	}

}
