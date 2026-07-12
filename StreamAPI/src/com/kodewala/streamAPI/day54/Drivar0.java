package com.kodewala.streamAPI.day54;

import java.util.Arrays;
import java.util.List;


public class Drivar0 {

	public static void main(String[] args) {
		
		// find the city name starting with a and convert to lower case.
		
		List<String>input =Arrays.asList("Bangalore", "Chennai", "Hyderabad", "Ahmedabad", "Delhi");

		// this will not do anything (intermediate operations are lazy )
		
		input.stream().filter(w->w.startsWith("A")).map(w->w.toLowerCase());

		long output=input.stream().filter(w->w.startsWith("A")).map(w->w.toLowerCase()).count();
		
		System.out.println(output);
		
	}

}
