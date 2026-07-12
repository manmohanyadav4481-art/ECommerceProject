package com.javacode;

 class DeliveryTest {
	
	String customerName ;
	String itemName;
	String delDate;
	String status;
	
	DeliveryTest (){
		System.out.println("Default contruction is called");
		
	}
	
	DeliveryTest (String customerName, String itemName, String delDate, String status){
		this.customerName = customerName;
		this.itemName = itemName;
		this.delDate = delDate;
		this.status = status;
		
	}
	
	void display () {
		System.out.println("CustomerName : "+customerName);
		System.out.println("ItemName : "+itemName);
		System.out.println("DelDate :"+delDate);
		System.out.println("Status :"+status);
		System.out.println("-------------");
		
		}
 }
	public class Delivery {
		public static void main(String[] args) {
		DeliveryTest d1 = new DeliveryTest();
		d1.display();
		
		DeliveryTest d2 = new DeliveryTest ("Rahul", "Leptop", "02-04-2026", "Delivered");
		
		DeliveryTest d3 = new DeliveryTest ("Priya", "Mobile", "03-04-26", "Pendding");
		
		DeliveryTest d4 = new DeliveryTest ("Amit", "Headphones", "04-04-2026", "Shipped");
		
		
		d2.display();
		d3.display();
		d4.display();// TODO Auto-generated method stub

	}

}
 
