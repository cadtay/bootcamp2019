package com.manchsterdigital;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 4, 5);

        int result = 0;
        for(Integer i : numbers){
            result += i * 2;
        }

        System.out.println("result = " + result);

        numbers.stream()
                .map(i -> i * 2)
                .reduce(0, Integer::sum);

      int sum = IntStream.range(0, 10)
                .sum();
        System.out.println("sum = " + sum);

        int anotherSum = IntStream.rangeClosed(0 ,10).sum();
        System.out.println("anotherSum = " + anotherSum);

        List<String> names = List.of("John", "Amy", "Jack");

        for(String name : names){
            String uCase = name.toUpperCase();
            System.out.println("uCase = " + uCase);
        }

        List<String> uppercasedNames = names.stream()
                .map(name -> name.toLowerCase())
                .collect(Collectors.toList());

        System.out.println("uppercasedNames = " + uppercasedNames);

        // improved version of capitals:
        List<String> uppercasedUsingMethodRef = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("uppercasedUsingMethodRef = " + uppercasedUsingMethodRef);

        // dealing with multiple streams...

        List<List<String>> richPeople = List.of(
                List.of("Jeff Bezos"),
                List.of("Bill Gates"),
                List.of("Deborah Meadon"),
                List.of("Mark Zukerberg")
        );

        List<String> flattenRichPeople = richPeople.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("flattenRichPeople = " + flattenRichPeople);
    }
}
