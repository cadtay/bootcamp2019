package com.manchsterdigital;

import java.util.List;
import java.util.stream.Collectors;

public class ReturnFirstInteger {
    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 34, 55, 44);
        square(integers);
    }

    private static List<Integer> square(List<Integer> nums){

        List<Integer> collect = nums.stream()
                .map(i -> i % 10)
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);

        return  collect;
    }
}
