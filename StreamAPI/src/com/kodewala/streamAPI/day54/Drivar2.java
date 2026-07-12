package com.kodewala.streamAPI.day54;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Drivar2 {

	public static void main(String[] args) {
	
		List<List<String>>input =Arrays.asList(Arrays.asList("Bangalore", "Chennai"), Arrays.asList("Hyderabad", "Ahmedabad", "Delhi"), Arrays.asList("Banaras"));

		System.out.println("2d : "+input);
		
		List<String>flattenList = input.stream().flatMap(list->list.stream()).collect(Collectors.toList());
	
		System.out.println("1d : "+flattenList);
	
		flattenList.stream().filter(w->w.startsWith("B") && w.length() > 5).forEach(word->System.out.println(word));
		
	}

}
