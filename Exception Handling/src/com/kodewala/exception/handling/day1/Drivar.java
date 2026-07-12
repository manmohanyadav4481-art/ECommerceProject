package com.kodewala.exception.handling.day1;

class Delivery {
	private String name;
	private String addline;
	private String addlin1;
	private String city;
	private String pincode;

	public Delivery(String name, String addline, String addlin1, String city, String pincode) {
		super();
		this.name = name;
		this.addline = addline;
		this.addlin1 = addlin1;
		this.city = city;
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddline() {
		return addline;
	}

	public void setAddline(String addline) {
		this.addline = addline;
	}

	public String getAddlin1() {
		return addlin1;
	}

	public void setAddlin1(String addlin1) {
		this.addlin1 = addlin1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	

	}
class Order
{
	private String status;
	private String message;
	
	public Order (String status, String message){
	super();
	this.status = status;
	this.message = message;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
public class Drivar {
	public static void main (String[]args) {
 Delivery dlivery = new Delivery ("man", "Btm1", "Btm2", "Mumbai", "421204");
  Order order; 
   try
   {
	   dlivery.getAddline();
	   dlivery.getAddlin1();
	   
	  String pincode = dlivery.getPincode();
	  
	  System.out.println(pincode.codePointAt(0));//NPE
	  
	   order = new Order ("Placed" , "Sent for Delivery");
   }catch (NullPointerException e) {
	    order = new Order ("Hold", "Address is incomplete");
   }
   System.out.println("Status : "+order.getStatus());
	}
}