package com.ecommerce.model;

public class Customer {

    private int customerId;
    private String customerName;
    private String email;
    private String password;
    private String mobile;
    private String address;

    public Customer() {
    }

    public Customer(String customerName, String email, String password,
                    String mobile, String address) {
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}