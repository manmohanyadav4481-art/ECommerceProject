package com.kodewala.objects5.day16;

class Ordeerr extends Object {
	
	int amount;
	String itemName;
	int qty;
	String status;
	
	public Ordeerr(int _amount, String _itemName, int _qty) {
		this (_amount, _itemName, _qty, "Placed");

	}
	
	public Ordeerr(int _amount, String _itemName, int _qty, String _status) {
		super (); //call super class ()
		this.amount = _amount;
		this.itemName = _itemName;
		this.qty = _qty;
		this.status = _status;
	
}
	public String toString () {
		return "Ordeerr [ amount ="+amount+
				", itemName= "+ itemName + ", qty= "+qty+
				", status ="+status + "]";
	}
}
public class Drivar2 {

	public static void main(String [] args) {

		Ordeerr or = new Ordeerr (100, "IPHone17", 2);
		
		System.out.println(or);
		

	}

}