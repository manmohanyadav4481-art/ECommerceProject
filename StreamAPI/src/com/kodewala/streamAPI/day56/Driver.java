package com.kodewala.streamAPI.day56;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 25, 40, 60, 80, 20, 100, 60, 80);

        Optional<Integer> thirdHighestEven = numbers.stream()
                .filter(n -> n % 2 == 0)      // keep only even numbers
                .distinct()                   // remove duplicates
                .sorted((a, b) -> b - a)      // descending order
                .skip(2)                      // skip 1st and 2nd highest
                .findFirst();                 // get 3rd highest

        System.out.println("3rd Highest Even Number: "
                + thirdHighestEven.orElse(null));
    }
}