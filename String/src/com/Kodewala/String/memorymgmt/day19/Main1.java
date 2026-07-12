package com.Kodewala.String.memorymgmt.day19;

public class Main1 {

	public static void main(String[] args) {
		
		String s1 = "Bangalore"; // 1 obj in scp
		
		String s2 = "Bangalore"; // no object created . s2 will refer
		
		System.out.println(s1==s2); // compare the objects address

	}

}
