package com.Kodewala.String.heap.scp.day20;

public class Main2 {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "Java";
		String s3 = new String ("java");
		String s4 = s1.concat("Python");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s4);

	}

}
