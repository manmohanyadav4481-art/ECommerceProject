package com.kodewala.objects5.day16;


class Orderr extends Object {
	
	int amount;
	String itemName;
	int qty;
	String status;
	
	public Orderr(int _amount, String _itemName, int _qty) {
		this (_amount, _itemName, _qty, "Placed");
		this.amount = _amount;
		this.itemName = _itemName;
		this.qty = _qty;
	}
	
	public Orderr(int _amount, String _itemName, int _qty, String _status) {
		
		this.amount = _amount;
		this.itemName = _itemName;
		this.qty = _qty;
		this.status = _status;
	
}
	public String toString () {
		return "Orderr [ Amount :  "+amount + ", ItemName : "+ itemName + ", Qty : "+qty+",Status : "+status+"]";
	}
}
public class Drivar1 {

	public static void main(String [] args) {

		Orderr or = new Orderr (100, "IPHone17", 2);
		
		System.out.println(or);

	}

}