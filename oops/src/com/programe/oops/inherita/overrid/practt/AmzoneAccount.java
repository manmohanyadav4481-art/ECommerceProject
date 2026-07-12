package com.programe.oops.inherita.overrid.practt;

class DeliveryService {
	Delivery delivery () {
		System.out.println("DeliverService . delivery");
		return new Delivery ("Processing");
	}
}
class Amazon extends DeliveryService {
	@Override
	AmazonDelivery delivery () {
		System.out.println("Amazon.delivery()");
		return new AmazonDelivery("Shipped" , "Tracking123");
	}
}
class Delivery {
	String status;
	Delivery (String status){
		this.status = status;
	}
}
class AmazonDelivery extends Delivery {
	String trackinggld;
	AmazonDelivery (String status,String trackinggld){
		super(status);
		this.trackinggld = trackinggld;
	}
	
}