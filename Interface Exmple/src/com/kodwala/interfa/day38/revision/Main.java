package com.kodwala.interfa.day38.revision;

public class Main {

	public static void main(String[] args) {

        //Simple massage
		MyInterface ex1 = ()-> "Hello Lambda";
		System.out.println("1 : "+ex1.doSomething());

		//2. UpperCase string
		MyInterface ex2 = () -> "hello lambda".toUpperCase();
		System.out.println("2 : "+ex2.doSomething());
		
		//3. String length
		MyInterface ex3 = ()->String.valueOf("Hello lambda".length());
		System.out.println("3 : "+ex3.doSomething());
		
		//4.Square of number
		MyInterface ex4 = ()->String.valueOf(5*5);
		System.out.println("4 : "+ex4.doSomething());
		
		// 5. square root
		MyInterface ex5 = ()->String.valueOf(Math.sqrt(16));
		System.out.println("5 : "+ex5.doSomething());
		
		// 6.reverse String
		MyInterface ex6 = ()-> new StringBuilder("java").reverse().toString();
		System.out.println("6 : "+ex6.doSomething());
		
		// 6.palindrome check
		MyInterface ex7 = ()->{
			String str = "madam";
			return String.valueOf(str.equals(new StringBuilder (str).reverse().toString()));
		};
		System.out.println("7 : "+ex7.doSomething());
		
		//7.count vowels
		MyInterface ex8 = ()->{
			String str = "Education";
			long count = str.toLowerCase().chars().filter(c->"aeiou".indexOf(c)!=-1).count();
			return String.valueOf(count);
		};
		System.out.println("8 : "+ex8.doSomething());
		
		//9. max of two numbers
		MyInterface ex9 = ()->String.valueOf(Math.max(40,10));
		System.out.println("9 : "+ex9.doSomething());
		
		//10. Square root message
		MyInterface ex10 =()->"Square root is"+Math.sqrt(30);
		System.out.println("10 : "+ex10.doSomething());
		
		//11. concatenate string
		MyInterface ex11 = ()->"Hello"+" World";
		System.out.println("11 : "+ex11.doSomething());
		
		//12. current date
		MyInterface ex12 = ()->new java.util.Date().toString();
		System.out.println("12 : "+ex12.doSomething());
		
		//13. Random number
		MyInterface ex13 = ()->String.valueOf(new java.util.Random().nextInt(100));
		System.out.println("13 : "+ex13.doSomething());

		//14. Trim and lowercase
		MyInterface ex14 = ()->"JAVA".trim().toLowerCase();
		System.out.println("14 : "+ex14.doSomething());
		
		//15. Multi-line Logic
		MyInterface ex15 = ()->{
			int a = 10, b = 5;
			int sum = a+b;
			return "sum is"+sum;
		};
		System.out.println("15 : "+ex15.doSomething());
		
		//default method call (optional)
		ex1.doNothing();
	}

}
