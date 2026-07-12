package com.kodewala.streamAPI.day54;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Drivar4 {

	public static void main(String[] args) {

		List<List<String>> input = Arrays.asList(
				Arrays.asList("Agra", "Bangalore", "Mumbai", "Chennai", "Faridabad", "Indore"),
				Arrays.asList("Chennai", "Lucknow", "Varanasi", "Banaras", "Allahabad", "Prayagraj", "Delhi"),
				Arrays.asList("Varanasi", "Barrially", "Balrampur", "Jaipur", "Ayodhaya", "Basti", "Azamgarh"));
		        HashSet<String>set = new HashSet<String>();
         List<String>output = input.stream().flatMap(i->i.stream()).filter(element-> !set.add(element)).collect(Collectors.toList());
	
         System.out.println(output);
	}

}
