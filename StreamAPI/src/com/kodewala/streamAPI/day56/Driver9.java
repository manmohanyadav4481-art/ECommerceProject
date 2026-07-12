package com.kodewala.streamAPI.day56;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver9 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Bangalore", "Pune", "Chennai", "Hyderabad", "Delhi", "Noida", "Mysore");

		// group the cities by the length whose is more than 6;

		Map<Integer, List<String>> output = list.stream().filter(w -> w.length() > 6)
				.collect(Collectors.groupingBy(w -> w.length()));

		System.out.println(output);

	}

}
