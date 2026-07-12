package com.kodwala.interfa.day38.revision;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExmple {

	public static void main(String[] args) {
 
		//Return fixed string
		Supplier <String>s = ()-> "Hello Lambda!";
		System.out.println("1 : "+ s.get());
		
		//convert string to uppercase
		Function<String, String> upper = str -> str.toUpperCase();
		System.out.println("2 : "+upper.apply("Java"));
		
		//3.find length of string
		Function<String, Integer>length = str ->str.length();
		System.out.println("3 : "+length.apply("Manmohan"));
		
		//4. Square of number
		Function <Integer, Integer>square = x->x*x;
		System.out.println("4 : "+square.apply(50));
		
		// 5.Square root
		Function<Integer,Double>sqrt = x->Math.sqrt(x);
		System.out.println("5 : "+sqrt.apply(16));
		
		//6.Palindrome check
		Predicate<String>isPalindrome = str->
		str.equals(new StringBuilder(str).reverse().toString());
		System.out.println("6 : "+isPalindrome.test("madam"));

		//7.Reverse string
		Function <String,String>reverse = str->
		new StringBuilder(str).reverse().toString();
		System.out.println("7 : "+reverse.apply("Java"));
		
		//8 . Count vowels
		Function<String, Long>countVowels = str ->
		str.toLowerCase().chars()
		.filter(c->"aeiou".indexOf(c)!=-1)
		.count();
		System.out.println("8 : "+countVowels.apply("education"));
		
		//9 . Max of two numbers
		BiFunction<Integer, Integer, Integer>max=(a,b)->a>b?a:b;
		System.out.println("9 : "+max.apply(10, 40));
		
		//10 . Square root with message
		Function<Integer,String>sqrtMsg=
				x->"Squar root is "+Math.sqrt(x);
				System.out.println("10 : "+sqrtMsg.apply(25));
				
				//Filter string starting with 'A'
				List<String>list1=Arrays.asList("Apple","Banana","Avacab" );
				System.out.println("11 : ");
				list1.stream()
				  .filter(str->str.startsWith("A"))
				  .forEach(str->System.out.print(str+""));
				System.out.println();
				
				//12. sort list of String
				List<String>list2 = Arrays.asList("cat", "elephat", "dog");
				System.out.println("12 : ");
				list2.stream()
				.sorted((a,b)->a.compareTo(b))
                 .forEach(str->System.out.print(str +""));
                 System.out.println();
                 
                 //13.sum of squares
                 List<Integer>nums1 = Arrays.asList(1,2,3,4);
                 int sum = nums1.stream()
                		 .map(x->x*x)
                		 .reduce(0, (a,b)->a+b);
                 System.out.println("13 : "+sum);
                 
                 //14. Square root of each element
                 List<Integer>num2 = Arrays.asList(4,9,16);
                 System.out.println("14 : ");
                 num2.stream()
                 .map(x->Math.sqrt(x))
                 .forEach(x->System.out.print(x+""));
                 System.out.println();
                 
                 //15. Count string length>4
                 
                 List<String>list3 = Arrays.asList("Java", "Python","C", "Node");
                 long count = list3.stream()
                		 .filter(str->str.length()>4)
                		 .count();
                 System.out.println("15 : "+count);
	}

}
