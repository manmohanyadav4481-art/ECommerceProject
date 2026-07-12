package com.kodwala.interfa.daytwo38;

public class DrivarPalinder {

	public static void main(String[] args) {

		Palinder p =()->{
			String str = "madam";
		return	String.valueOf(str.equals(new StringBuilder(str).reverse().toString()));


		};
		String value =p.check();
		System.out.println(value);
		

	}

}
