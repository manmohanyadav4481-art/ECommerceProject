package com.zepto.order.response;

public class OrderResponse {

    private int id;
    private int orderId;
    private int customerId;
    private int productId;
    private int quantity;
    private String paymentMethod;
    private String shippingAddress;


    // =========================================================
    // ID
    // =========================================================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    // =========================================================
    // ORDER ID
    // =========================================================

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    // =========================================================
    // CUSTOMER ID
    // =========================================================

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    // =========================================================
    // PRODUCT ID
    // =========================================================

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    // =========================================================
    // QUANTITY
    // =========================================================

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    // =========================================================
    // PAYMENT METHOD
    // =========================================================

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    // =========================================================
    // SHIPPING ADDRESS
    // =========================================================

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}