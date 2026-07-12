package com.kodwala.interfa.dayone38;

public class Driver1 {

	public static void main(String[] args) {
		
		AddNumber ad = (i,j)-> (i+j);
		AddNumber mult = (i,j)->(i*j);
		
		int sum = ad.add(56, 67);
		int product = mult.add(65,78);
		
		System.out.println("add : "+sum);
		System.out.println("mult : "+product);

	}

}
