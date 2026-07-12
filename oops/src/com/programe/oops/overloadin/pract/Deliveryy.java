package com.programe.oops.overloadin.pract;

class Delivery {
	public void orderPlace () {
		System.out.println("Delivery.orderPlace");
	}
}
class Amazom extends Delivery {
	@Override
	public void orderPlace () {
		System.out.println("Amazom.orderPalce");
	}
}

public class Deliveryy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delivery delivery = new Amazom();
delivery.orderPlace();
	}

}
