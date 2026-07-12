package com.Kodewala.String.heap.scp.day20;

public class Main0 {

	public static void main(String[] args) {
		
		String s1 = "Kodewala"; // 1 object created in scp
		
		String s3 = "Kodewala"; //s3 will refer existing s1 objec
		
		System.out.println(s1==s3); //true
		
		String s2 = new String ("Academy"); //1 in heap + 1 scp
		
		System.out.println(s2==s3);//false
		
		System.out.println(s2.equals(s3));

	}

}
