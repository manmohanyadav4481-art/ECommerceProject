package com.kodewala.streamAPI.day56;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver6 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 25, 40, 60, 80, 20, 100);

        Optional<Integer> max = numbers.stream()
                                       .max(Integer::compareTo);

        System.out.println("Maximum Number: " + max.orElse(null));
    }
}