package com.Kodewala.String.heap.scp.day21;

final class Account // you cannot extends they class
{
	
}

public class Main1 extends Account {

	public static void main(String[] args) {

		String s1 = "Hello"+"World"; // scp
		
		String s2 = "Kodewala";
		String s3 = "Academy";
		
		String s4 = s2+s3; // s4 ? ---> heap --> "Kodewala Academy"
		
		String s5 = s4.intern(); // copy object (s4) from heap to scp
		
		System.out.println(s4==s5); // true (scp)

	}

}
