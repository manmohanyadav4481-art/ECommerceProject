package com.kodewala.streamAPI.day54;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Drivar1 {

	public static void main(String[] args) {
		
		// find the city names which starts with B and city name length is more then 6
		
		List<String>city=Arrays.asList("Azamgarh", "Jaunpur", "Balrampur" , "Bahraeach", "Barially", "Badaun","Lucknow","Varansi", "Allahabad");

	    city.stream().filter(w->w.startsWith("B")).map(w->w.toLowerCase());
	    
	    List<String>output=city.stream().filter(w->w.startsWith("B")).map(w->w.toLowerCase()).collect(Collectors.toList());
	    
	    System.out.println(output);
	}

}
