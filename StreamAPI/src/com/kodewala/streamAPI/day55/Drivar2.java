package com.kodewala.streamAPI.day55;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Drivar2 {

	public static void main(String[] args) {
		
		List<Integer>input = Arrays.asList(10, 2,3,4,5 ,66,7);
		
		// skip the number
		
		input.stream().skip(2).forEach(n->System.out.println(n));

		Optional<Integer>output =input.stream().filter(n->n%2==0).distinct().sorted((a,b)->b-a).skip(2).findFirst();
		
		
	}

}
