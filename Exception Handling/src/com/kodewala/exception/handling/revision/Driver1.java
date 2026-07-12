package com.kodewala.exception.handling.revision;

class Zomato {
	private String product;
	private String price;
	private String addDlvr;
	private String adddlr;
	private String city;
	private String pincode;
	
	public Zomato(String product, String price, String addDlvr, String adddlr, String city, String pincode) {
		super();
		this.product = product;
		this.price = price;
		this.addDlvr = addDlvr;
		this.adddlr = adddlr;
		this.city = city;
		this.pincode = pincode;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAddDlvr() {
		return addDlvr;
	}

	public void setAddDlvr(String addDlvr) {
		this.addDlvr = addDlvr;
	}

	public String getAdddlr() {
		return adddlr;
	}

	public void setAdddlr(String adddlr) {
		this.adddlr = adddlr;
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
class Orderr 
{
	private String status;
	private String massage;
	public Orderr(String status, String massage) {
		super();
		this.status = status;
		this.massage = massage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	
	
	
}
public class Driver1 {
	public static void main (String []args) {
		Zomato z = new Zomato ("man", "Btm1", "Btm2", "Mumbai", "421204", "nam");
		Orderr or ;
		try 
		{
			z.getAdddlr();
			z.getAddDlvr();
			
		String address =z.getPincode();
		
		System.out.println(address.codePointAt(0));
		

         or = new Orderr ("Placed", "Delivery send");
		
	}catch(Exception e) {
	    or = new Orderr ("Hold","incomplete");
	}
		System.out.println(or.getStatus());
	}
	

}





