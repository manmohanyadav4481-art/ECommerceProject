package com.javacode;
public class Main{
	public static void main (String [] args) {

		String target = "Dhelhi";
				String arr[] = {"Chennai" , "Mumbai" , "Dhelhi", "Jaipur"};

		for(int i = 1; i <arr.length; i++) {
			System.out.println("Inside for loop");
			if(target == arr [i]) {
				System.out.println("the target is found :"+arr[i]);
				break;
		}
	}
	
}
}
