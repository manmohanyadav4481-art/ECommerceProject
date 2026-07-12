package com.kodewala.exception.handling.revision1;

class Delivery {
	private String name;
	private String Addline1;
	private String Addline2;
	private String city;
	private String pincode;
	
	public Delivery(String name, String addline1, String addline2, String city, String pincode) {
		super();
		this.name = name;
		Addline1 = addline1;
		Addline2 = addline2;
		this.city = city;
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddline1() {
		return Addline1;
	}

	public void setAddline1(String addline1) {
		Addline1 = addline1;
	}

	public String getAddline2() {
		return Addline2;
	}

	public void setAddline2(String addline2) {
		Addline2 = addline2;
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

class Order {
	private String status;
	private String message;
	
	public Order(String status, String message) {
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





public class Main {

	public static void main(String[] args) {
	
		Delivery de = new Delivery ("Manmohan", "BTM1",  "BTM1stg", null , null);
		Order or;
		try
		{
			de.getAddline1();
			de.getAddline2();
			
			String pincode = de.getPincode();
			System.out.println(pincode.charAt(0));
			
			or = new Order ("Placed", "Send for Delivery");
		}
		catch (NullPointerException e)
		 {
		
			or = new Order ("Hold", "Address is Incompletede");
			
		}
		System.out.println(or.getStatus());

	}

}
