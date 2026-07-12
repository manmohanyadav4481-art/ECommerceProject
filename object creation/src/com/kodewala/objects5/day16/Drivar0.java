package com.kodewala.objects5.day16;

class Ordeer extends Object {
	
	int amount;
	String itemName;
	int qty;
	String status;
	
	public Ordeer(int _amount, String _itemName, int _qty) {
		this (_amount, _itemName, _qty, "Placed");

	}
	
	public Ordeer(int _amount, String _itemName, int _qty, String _status) {
		
		this.amount = _amount;
		this.itemName = _itemName;
		this.qty = _qty;
		this.status = _status;
	
}
	public String toString () {
		return "Ordeer [ Amount : "+amount+",ItemName : "+itemName+", Qty : "+qty+",Status : "+status+"]";
	}
}
public class Drivar0 {

	public static void main(String [] args) {

		Ordeer or = new Ordeer (100, "IPHone17", 2);
		
		System.out.println(or);

	}

}