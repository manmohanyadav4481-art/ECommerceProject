package com.kodewala.streamAPI.day56;

import java.util.*;

public class Driver1 {


	public static void main(String[] args) {
   
		List<Integer>list =Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		int sum = list.stream().reduce(0,(a,b)->a+b);

		System.out.println(sum);

	}
}
