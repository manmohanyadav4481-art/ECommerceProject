package com.kodewala.objects0.day14;

class Delivery1
{
	String customerName;
	String itemName;
	String delDate;
	String status;
	 
	Delivery1 (String _customerName, String _itemName, String _delDate, String _status) {
		
		customerName = _customerName;
		itemName = _itemName;
		delDate = _delDate;
		status = _status;
	}
	
	
}

public class Drivar8 {

	public static void main(String[] args) {
	
		Delivery1 de = new Delivery1 ("manmohan", "mobile", "03/06/2026", "successfully");
		Delivery1 de1 = new Delivery1 ("mohan", "mobile", "03/06/2026", "successfully");
		Delivery1 de3 = new Delivery1 ("man", "mobile", "03/06/2026", "successfully");

		System.out.println(de.customerName);
		System.out.println(de.itemName);
		System.out.println(de.delDate);
		System.out.println(de.status);
		
		System.out.println(de1.customerName);
		System.out.println(de1.itemName);
		System.out.println(de1.delDate);
		System.out.println(de1.status);
		
		System.out.println(de3.customerName);
		System.out.println(de3.itemName);
		System.out.println(de3.delDate);
		System.out.println(de3.status);
	}
	

}
