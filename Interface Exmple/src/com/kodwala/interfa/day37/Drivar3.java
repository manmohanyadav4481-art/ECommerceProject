package com.kodwala.interfa.day37;

public class Drivar3 {

	public static void main(String[] args) {
		Pay pa =(i,j)->{int sum= i+j;
		return sum;
		};
		int sum = pa.add(12,23);
		System.out.println(sum);

	}

}
