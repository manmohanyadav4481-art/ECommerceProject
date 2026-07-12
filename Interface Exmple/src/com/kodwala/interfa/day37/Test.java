package com.kodwala.interfa.day37;

public class Test {

	public static void main(String[] args) {


		// lambda implementation
		MyInterface obj = ()->{
			return "Hello from lambda!";
		};
		
		//calling abstract method
		String result = obj.doSomething();
		System.out.println(result);

		//calling abstract method
		obj.doNothing();
	}

}
