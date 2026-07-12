package com.programe.oops.inherita.overrid.practt;

class FoodService {


	Order placeOrder(String item) {
		System.out.println("FoodService.PlaceOrder");
		return new Order ("Order placed");
	}

	
	

}
class Zomatoa extends FoodService {
	@Override
	  ZomatoaOrder placeOrder (String item) {
		System.out.println("Zomato.PlaceOrder ()");
		return new ZomatoaOrder("Deliverd", "30 mins");
	}
}

class Order{ 
String status;
Order (String status ){
	this.status = status;
}
}
class ZomatoaOrder extends Order {
	String time;
	ZomatoaOrder(String status, String time){
		super(status);
		this.time = time;
	}
}
