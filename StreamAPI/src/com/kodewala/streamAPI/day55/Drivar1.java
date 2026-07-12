package com.kodewala.streamAPI.day55;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Drivar1 {

	public static void main(String[] args) {
		
		List<Integer>input = Arrays.asList(4,5,5,67,88,88,70,55,5,88,33,5,56,70);
		// sorting /
		
		input.stream().sorted((a,b)->b-a).forEach(number -> System.out.println(number));
		
		

	}

}
