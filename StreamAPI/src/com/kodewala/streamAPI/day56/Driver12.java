package com.kodewala.streamAPI.day56;

public class Driver12 {

	public static void main(String[] args) {

		// find the first non repeating char

		String word = "swiss";

		word.chars().mapToObj(c -> (char) c).filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch))
				.forEach(c -> System.out.println(c));

	}

}
