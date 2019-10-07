package com.manchesterdigital;

import java.util.Enumeration;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalExamples {
    // 1st calculate total price of items
    // 2nd multiple sales by tax
    // 3rd add sales to total
    // 4th return total
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers.get(i) = " + numbers.get(i));
        }

        for (Integer i : numbers) {
            System.out.println("numbers = " + numbers);
        }

        // LAMBDA

        // (A list of parameters separated by commas ) -> {expression body which contains one or more statements}


        NumericTest isEven = (n) -> (n % 2 == 0);

        System.out.println(
                "is 4 an even number " + isEven.computeTest(4)
        );

        System.out.println(
                "is 5 an even number " + isEven.computeTest(5)
        );

        NumericTest isNegative = (n) -> (n < 0);
        System.out.println(
                "-1 is negative? " + isNegative.computeTest(-1)
        );

        NumericTest isOdd = (n) -> false;

        Greeting greetingFrence = () -> System.out.println("Bonjour");

        Greeting greetingSpanish = () -> System.out.println("Hola");

        greetingSpanish.message();
        greetingFrence.message();

        // Takes in a string returns some integer
        Function<String, Integer> getWordLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String word) {
                return word.length();
            }
        };

        Integer hellolength  = getWordLength.apply("Hello");
        System.out.println("hellolength = " + hellolength);

        Function<String, Integer> getWordLengthModernised = String::length;
        Integer len = getWordLengthModernised.apply("Amy");

        System.out.println("len = " + len);

        Function<Artist, String> extractArtistName = Artist::getName;
        Function<String, String> convertToUpperCase = String::toUpperCase;

        Artist skepta = new Artist("Skepta", 2000000L);

        String artist = extractArtistName.apply(skepta);

        String upperCased = convertToUpperCase.apply(artist);
        System.out.println("upperCased = " + upperCased);

       String allFunctions =  extractArtistName.andThen(convertToUpperCase).apply(skepta);
        System.out.println("allFunctions = " + allFunctions);

        Function<Integer, Double> half = a -> a / 2.0d;

        half = half.compose(a -> a * 3);

        System.out.println("half.apply(5) = " + half.apply(5));

        // calculate half of 10 and then run the following lambda from 'andThen'
        half.andThen(a -> a * 3);

        System.out.println("half.apply(10) = " + half.apply(10));

        MultiplyNumbers multipy = (a) -> (a * 2);
        System.out.println("multipy = " + multipy.multiply(4));
        Function<Integer, Integer> multipleby2 = a -> a * 2;
        System.out.println("multipleby2 = " + multipleby2.apply(2));

        Divider divider = (a, b) -> a / b;

        Double doubleresult = divider.divideIt(6d, 3d);
        System.out.println("doubleresult = " + doubleresult);

        //This will fail:
        Double doubleResult = divider.divideIt(6,0);

        Divider safeDivider = (a, b) -> {
            if(b ==0){
                return 0d;
            }
            return a/b;
        };

        Divider safeDivider2 = (a, b) ->  (b == 0) ? b : a / b;
        Double zeroResult = safeDivider2.divideIt(2d, 0d);
        System.out.println("zeroResult = " + zeroResult);


    }
}




