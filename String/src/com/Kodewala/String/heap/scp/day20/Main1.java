package com.Kodewala.String.heap.scp.day20;

public class Main1 {

	public static void main(String[] args) {
		
		String s1 = "Kodewala"; // 1 object created in scp
		
		// s1.concat("academy");  // trying to change the existing s1 object ! s3--> heap and content : kodewala Academy
		 
		String s3 = s1.concat(" Academy");
		
		
		String s4 = "Kodewala Academy"; // s4--> scp and content : kodewala Academy

		System.out.println(s3==s4);
		
		String s10 = "Bangalore";
		String s11 = "India";
		String s12 = new String ("Bangalore India"); // s12 will be created in heap --> Bangalore India
		
		String s13 = "Bangalore India"; // scp
		
		System.out.println(s12==s13);
		
		String s14 = "Hello"+"World"+"India"; // compile time optimization only single object will be created
	    System.out.println(s14);
	}

}
