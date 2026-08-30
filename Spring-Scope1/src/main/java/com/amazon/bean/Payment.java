package com.amazon.bean;

public class Payment {

	private String RefID;

	public String getRefID() {
		return RefID;
	}

	public void setRefID(String refID) {
		RefID = refID;
	}
	
	public void showDetails () {
		
		System.out.println("RefId is : "+RefID);
	}
}
