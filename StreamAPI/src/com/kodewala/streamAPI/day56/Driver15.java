package com.kodewala.streamAPI.day56;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Driver15 {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("Bangalore", "Delhi", "Pune", "Chennai", "Hyderabad");
		List<String> list2 = Arrays.asList("Delhi", "Noida", "Mysore", "Delhi");

		Stream.concat(list1.stream(), list2.stream()).distinct().forEach(w -> System.err.println(w));

	}

}
