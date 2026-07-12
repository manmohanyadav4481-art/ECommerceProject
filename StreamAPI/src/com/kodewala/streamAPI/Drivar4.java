package com.kodewala.streamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Drivar4 {

	public static void main(String[] args) {
		
		List<Integer>list =Arrays.asList(2,34,43,5,67,87,9,56,100,555,4322,667);

		List<Integer>output =list.stream().map(n-> n*10).filter(n->n>100).collect(Collectors.toList());
	
		System.out.println(output);
	}

}
