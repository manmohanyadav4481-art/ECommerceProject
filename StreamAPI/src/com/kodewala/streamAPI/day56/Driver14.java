package com.kodewala.streamAPI.day56;

import java.util.Optional;

public class Driver14 {

	public static void main(String[] args) {

		// find the first non repeating char

		String word = "swiss";

		Optional<Character> out = word.chars().mapToObj(c -> (char) c)
				.filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch)).skip(1). findFirst();

		System.out.println(out.get());
	}

}
