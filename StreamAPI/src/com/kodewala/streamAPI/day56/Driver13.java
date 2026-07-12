package com.kodewala.streamAPI.day56;

import java.util.Optional;

public class Driver13 {

	public static void main(String[] args) {

		// find the first non repeating char

		String word = "swiss";

		Optional<Character> out = word.chars().mapToObj(c -> (char) c)
				.filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch)). findFirst();

		System.out.println(out.get());
	}

}
