package com.kodewala.streamAPI.day56;

import java.util.*;

public class Driver3 {


	public static void main(String[] args) {
   
		List<Integer>list =Arrays.asList(1,2,3);
		
		int sum = list.stream().filter(n->n%2 !=0).reduce(0,(a,b)->a+b);

		System.out.println(sum);

	}
}
