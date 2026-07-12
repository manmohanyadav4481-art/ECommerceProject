package com.programe.oops.mult.inhirt.pract;

class Order {
	void placeOrder () {
		System.out.println("Order Placed");
	}
}
class Restaurant extends Order {
	void placeOrder () {
		System.out.println("Restaurant Accept Order");
	}
}
class Delivery extends Restaurant {
	void placeOrder () {
		System.out.println("Out for Delivery");
	}
}
class Zomato extends Delivery {
	void placeOrder () {
		System.out.println("Delivery by Zomato");
	}
}


public class DeliveryMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Order or = new Restaurant ();
or.placeOrder();
	}

}
