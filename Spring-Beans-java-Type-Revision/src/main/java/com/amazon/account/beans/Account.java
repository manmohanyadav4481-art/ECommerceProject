package com.amazon.account.beans;

public class Account {

private String setAccountNumber;
private String setifscCode;
private String setAccHolderName;



public String getSetAccountNumber() {
	return setAccountNumber;
}
public void setSetAccountNumber(String setAccountNumber) {
	this.setAccountNumber = setAccountNumber;
}
public String getSetifscCode() {
	return setifscCode;
}
public void setSetifscCode(String setifscCode) {
	this.setifscCode = setifscCode;
}
public String getSetAccHolderName() {
	return setAccHolderName;
}
public void setSetAccHolderName(String setAccHolderName) {
	this.setAccHolderName = setAccHolderName;
}


public void display ()
{
	System.out.println( "Account [setAccountNumber=" + setAccountNumber + ", setifscCode=" + setifscCode + ", setAccHolderName="
			+ setAccHolderName + "]");
}
	
	
	
}
