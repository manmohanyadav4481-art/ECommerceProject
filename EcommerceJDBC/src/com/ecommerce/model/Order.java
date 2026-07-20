package com.ecommerce.model;

public class Order 
{

	private int orderId;
	private int customerId;
	private double totalAmount;
	private String orderDate;
	
	public Order() {
		
	}
	
	public Order(int orderId, int customerId, double totalAmount, String orderDate) {
		
		this.orderId = orderId;
		this.customerId = customerId;
		this.totalAmount = totalAmount;
		this.orderDate = orderDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
