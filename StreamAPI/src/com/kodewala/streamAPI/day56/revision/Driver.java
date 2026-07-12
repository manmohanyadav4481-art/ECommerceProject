package com.kodewala.streamAPI.day56.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {

	List<Integer>input=Arrays.asList(1,2,1,3,4,5,5,21,12);
	
	input.stream().sorted((a,b)->a-b).skip(2).forEach(number-> System.out.println(number));
	
	Optional<Integer>optinal=input.stream().findFirst();
	
	System.out.println(optinal.get());
	
	}
}
