package com.kodewala.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Drivar2 {

	public static void main(String[] args) {
		
		List<String> brand = Arrays.asList("samsung", "lg", "sony", "bosch", "apple", "nokia", "micromax", "realme");  // Collection

		// Task : form a geven list can you find the brand starting with 's' and convert
		// those to upper case 
		
		List<String> processedBrands =brand.stream().filter(b ->b.startsWith("s")).map(word -> word.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("processed : "+processedBrands);

	}

}
