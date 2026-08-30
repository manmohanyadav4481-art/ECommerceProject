package com.amazon.di.constructor.payment;

public class Payment {

	private String refId;

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}
	
	public void showDetails ()
	{
		System.out.println("refId...... : "+refId);
	}
}
