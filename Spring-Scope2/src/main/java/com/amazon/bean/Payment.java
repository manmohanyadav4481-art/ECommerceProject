package com.amazon.bean;


public class Payment {

	
	private String RefId;

	public String getRefId() {
		return RefId;
	}

	public void setRefId(String refId) {
		RefId = refId;
	}
	
	public void showDetails () {
		
		System.out.println("Refid is : "+RefId);
	}
	
}
