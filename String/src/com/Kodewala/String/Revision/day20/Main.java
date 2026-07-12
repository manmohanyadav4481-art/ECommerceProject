package com.Kodewala.String.Revision.day20;

public class Main {

	public static void main(String[] args) {
		
		String m1 = "Manmohan";
		String m2 = "Manmohan";
		System.out.println(m1==m2);
		String s2 = new String ("Manmohan");
		String m3 = m1+m2;
	
		String s4 = m3.intern();
		System.out.println(m3==s4);
		System.out.println(s4);
		
		System.out.println(m1.equals(s2));
		System.out.println(m1.equals(s2));
	}

}
