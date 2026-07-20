package com.ecommerce.model;

import org.junit.jupiter.api.Test;


public class OrderItem 
{

	private int orderItemId;
	private int orderId;
	private int productId;
	private int quantity;
	private double price;
	
	
	public OrderItem() {
		
	}
	
	
	public OrderItem(int orderItemId, int orderId, int productId, int quantity, double price) {
		this.orderItemId = orderItemId;
		this.orderId = orderId;
		this.productId =productId;
		this.quantity = quantity;
		this.price =price;
	}

	public int getOrderItemId() {
		return orderItemId;
	}
     @Test
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getOrderId() {
		return orderId;
	}
    @Test
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}
     @Test
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}
    @Test
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}
    @Test
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
