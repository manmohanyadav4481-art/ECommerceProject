package com.kodewala.streamAPI.day56;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver10 {

	public static void main(String[] args) {
		
	List<String>list =Arrays.asList("Bangalore", "Pune", "Chennai", "Hyderabad", "Delhi", "Noida", "Mysore");
	
	// group the cities by the length whose is more than 6;
	
	long output =list.stream().filter(w->w.length() >6).collect(Collectors.counting());
	
	System.out.println(output);

	}

}
