package com.kodwala.interfa.dayone38;

public class Drivar {

	public static void main(String[] args) {
		
		Calculator c = (i, j)->{
			int sum = i+j;
			return sum  ;
			
		};
		Calculator m = (i,j)->{
			int mult = i*j;
			return mult;
		};
		int sum = c.add(12,550);
		int mult = m.add(12,32);
		System.out.println("Sum : "+sum);
        System.out.println("Multi : "+mult);
	}

}
