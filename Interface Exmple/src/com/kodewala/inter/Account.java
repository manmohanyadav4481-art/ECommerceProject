package com.kodewala.inter;

interface DelivaryEcom {
	void order ();
	void shipAdd ();
	void qtyItem ();
	
	default void billgenerate () {
		System.out.println("DelivaryEcom.billgenerate()");
		sendSms () ;
	}
	static void sendNotification () {
		System.out.println("DelivaryEcom.sendNotification()");
		 connectserver ();
		 notification ();
		 
	}
	static void printPDF () {
		System.out.println("DelivaryEcom.printPDF()");
		 connectserver ();
		 notification ();
		 
		
	}
	private static  void connectserver () {
		System.out.println("DelivaryEcom.connectserver()");
	}
	private static void notification () {
		System.out.println("DelivaryEcom.notification()");
	}
	private void sendSms () {
		System.out.println("DelivaryEcom.sendSms()");
	}
}
	
class Amazon implements DelivaryEcom {

	@Override
	public void order() {
		System.out.println("Amazon.order()");
		
	}

	@Override
	public void shipAdd() {
	System.out.println("Amazon.shipAdd()");
		
	}

	@Override
	public void qtyItem() {
		System.out.println("Amazon.qtyItem()");
		
	}
	@Override
	public void billgenerate () {
		System.out.println("Amazon.billgenerate()");
		printPDF ("path Store ", "company logo");
	}
	private void printPDF (String path , String companylogo) {
		System.out.println("Amazon.printPDF()");
		DelivaryEcom.printPDF();
		
	}
	
}
class Flipkart implements DelivaryEcom {

	@Override
	public void order() {
		System.out.println("Flipkart.order()");
		
	}

	@Override
	public void shipAdd() {
		System.out.println("Flipkart.shipAdd()");
		
	}

	@Override
	public void qtyItem() {
		System.out.println("Flipkart.qtyItem()");
		
	}
	@Override
	public void billgenerate () {
		System.out.println("Flipkart.billgenerate()");
		printPDF ("path Store ", "company logo");
	}
	private void printPDF (String path , String companylogo) {
		System.out.println("Flipkart.printPDF()");
		DelivaryEcom.printPDF();
	
}
}

public class Account {
	public static void main (String[]args) {
		DelivaryEcom com = new Flipkart ();
		com.order();
		com.shipAdd();
		com.qtyItem();
		com.billgenerate();
		DelivaryEcom co = new Amazon ();
		co.order();
		co.shipAdd();
		co.qtyItem();
		co.billgenerate();
	}
}