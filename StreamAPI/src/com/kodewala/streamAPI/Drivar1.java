package com.kodewala.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Drivar1 {

	public static void main(String[] args) {
		
    List<String> brand = Arrays.asList("samsung", "lg", "sony", "bosch", "apple", "nokia", "micromax", "realme");  // Collection
	
    System.out.println("input : "+brand);
    
		// process the collection task --> convert all the brand to upper case
		
		// 1 - convert the collection (list) to stream object
	
    Stream<String>stream = brand.stream();
    
    //2. apply processing logic (intermediate and terminal)
		
    Stream<String>upperCaseStream = stream.map(word->word.toUpperCase());

    // 3. collect the result / terminate the stream
    
     long processedBrand= upperCaseStream.count();
    
    System.out.println("processed : "+processedBrand);
	}

}