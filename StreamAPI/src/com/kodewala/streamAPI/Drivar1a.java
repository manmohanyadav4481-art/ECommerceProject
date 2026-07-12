package com.kodewala.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Drivar1a {

	public static void main(String[] args) {
	
		List<String> brand = Arrays.asList("samsung", "lg", "soney","apple", "nokia","micromax","realme");
		
		List<String>processedBrands = brand.stream().map(w->w.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("processd : "+processedBrands);

	}

}
