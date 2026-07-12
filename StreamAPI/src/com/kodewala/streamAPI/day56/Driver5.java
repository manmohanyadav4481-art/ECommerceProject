package com.kodewala.streamAPI.day56;


import java.util.*;
import java.util.stream.*;

public class Driver5 {

	

	

	public static void main(String[] args) {
	
		List<Integer>list =Arrays.asList(1,2,3,4,5);
		
		Optional<Integer>optinal =list.stream().max((a,b)->a-b);
	
		System.out.println(optinal.get());
	}

}
