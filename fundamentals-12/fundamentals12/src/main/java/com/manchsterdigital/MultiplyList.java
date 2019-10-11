package com.manchsterdigital;

/*Given a list of integer, return a list where each integer is multiplied by itself

square([1, 2, 3]) -> [1, 4, 9]
square([6, 8, -8]) -> [36, 64,64]
square([ ]) -> [ ] */

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplyList {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4);

        numbersToMultiple(integers);

    }

    private static List<Integer> numbersToMultiple(List<Integer> multiply){

        List<Integer> collect = multiply.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);

        return collect;
    }
}
