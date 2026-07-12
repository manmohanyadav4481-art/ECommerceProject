package com.kodewala.streamAPI.day54;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Drivar {

	public static void main(String[] args) {
		
		// find the city name starting with a and convert to lower case.
		
		List<String>input =Arrays.asList("Bangalore", "Chennai", "Hyderabad", "Ahmedabad", "Delhi");
		
		input.stream().filter(w->w.startsWith("A")).map(w->w.toLowerCase());

		List<String>output=input.stream().filter(w->w.startsWith("A")).map(w->w.toLowerCase()).collect(Collectors.toList());
		
		System.out.println(output);
		
	}

}
