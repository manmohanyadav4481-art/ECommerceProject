package com.kodewala.streamAPI.day55;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Drivar3 {

	public static void main(String[] args) {
		
		// print first element from given list of int
		
		List<Integer>input =Arrays.asList(10,4,3,56,34,5,7,3);
		
		Optional<Integer>optinal =input.stream().findFirst();
		System.out.println(optinal.get());

	}

}
