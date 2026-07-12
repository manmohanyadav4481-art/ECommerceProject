package com.programe.oops.String.scp.heap.day21.revision;

public class Main0 {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder ("Manmohan");
		
		str.append(" Yadav");
		
		String s1 = "Hello"+" World";
		
		System.out.println(s1);
		
		String s2 = "Kodewala";
		String s3 = " World";
		
		String s4 = s2+s3;
		
		System.out.println(s4);
		
		String s5 = s4.intern();
		
		System.out.println(s4==s5);
      
		System.out.println(str);
	}

}
