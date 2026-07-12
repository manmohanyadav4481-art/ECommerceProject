package com.kodewala.oops.polymorphism.overloadin.day30;

public class Account {

	void signIn (String name ,int password) {
		System.out.println("Account.signIn");
	}
	
	void signIn (String name , int amount , String note) {
		System.out.println("Account.String name , int amount , String note");
	}
	void signIn (String adharCard) {
		System.out.println("Account.String adharCard");
	}
}


