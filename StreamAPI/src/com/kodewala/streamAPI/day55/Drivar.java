package com.kodewala.streamAPI.day55;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Drivar {

	public static void main(String[] args) {
		
		List<Integer>input = Arrays.asList(4,5,5,67,88,88,70,55,5,88,33,5,56,70);
		
		// remove the duplicate
		
		List<Integer>output =input.stream().distinct().collect(Collectors.toList());
		
		System.out.println(output);

	}

}
