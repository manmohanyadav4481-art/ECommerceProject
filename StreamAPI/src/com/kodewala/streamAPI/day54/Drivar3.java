package com.kodewala.streamAPI.day54;

import java.util.Arrays;
import java.util.List;

public class Drivar3 {

	public static void main(String[] args) {
		
		List<Integer>number =Arrays.asList(2,22,13,31,51,14,15,21,24);
		
		number.stream().filter(i->i%2==0).map(i->i*10).forEach(i->System.out.println(i));

	}

}
