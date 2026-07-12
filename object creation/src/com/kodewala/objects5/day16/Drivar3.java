package com.kodewala.objects5.day16;
// this is call constractor chaining 
class orderMgmt {
	public orderMgmt (String neme) {
		super ();
	}
}

class Ordeerrr extends Object {
	
	int amount;
	String itemName;
	int qty;
	String status;
	
	public Ordeerrr(int _amount, String _itemName, int _qty) {
		this (_amount, _itemName, _qty, "Placed");

	}
	
	public Ordeerrr(int _amount, String _itemName, int _qty, String _status) {
		super (); //call super class ()
		this.amount = _amount;
		this.itemName = _itemName;
		this.qty = _qty;
		this.status = _status;
	
}
	public String toString () {
		return "Ordeerr [amount ="+amount +", itemName="+itemName+", qty="+qty+",status"+status+"]";
	}
}
public class Drivar3 {

	public static void main(String [] args) {

		Ordeerrr or = new Ordeerrr (100, "IPHone17", 2);
		
		System.out.println(or);

	}

}