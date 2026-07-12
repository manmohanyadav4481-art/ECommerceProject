package com.programe.oops.inherit;

public class DeliveryMan {

		    String productName;
		    String productId;
		    int price;

		    // Constructor
		    DeliveryMan(String productName, String productId, int price) {
		        this.productName = productName;
		        this.productId = productId;
		        this.price = price;
		    }

		    // Method to display product details
		    public void productDetails() {
		        System.out.println("Product Name: " + productName);
		        System.out.println("Product ID: " + productId);
		        System.out.println("Price: " + price);
		    }

		    // Main method
		    public static void main(String[] args) {
		        DeliveryMan d1 = new DeliveryMan("Laptop", "P101", 50000);
		        d1.productDetails();
		    }
		}
	


