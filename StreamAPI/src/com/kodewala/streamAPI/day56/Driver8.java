package com.kodewala.streamAPI.day56;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver8 {

	public static void main(String[] args) {
		
	List<String>list =Arrays.asList("Bangalore", "Pune", "Chennai", "Hyderabad", "Delhi", "Noida", "Mysore");
	
	// group the cities by the length
	
	Map<Integer, List<String>> output =list.stream().collect(Collectors.groupingBy(w->w.length()));
	
	System.out.println(output);

	}

}
