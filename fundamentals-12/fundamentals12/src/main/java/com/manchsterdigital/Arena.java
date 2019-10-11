package com.manchsterdigital;

import java.lang.reflect.Member;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class Arena {
    public static void main(String[] args) {
        Artists arianaGrande = new Artists("Ariana Grande",
                List.of(new Members("Ariana Grande")), "London");

        Artists beatles = new Artists("Beatles",
                List.of(new Members("John Lennon"),
                        new Members("Paul McCartney"),
                        new Members("Ringo Starr"),
                        new Members("George Harrison")), "Liverpool");

        Artists coldplay = new Artists("Coldplay",
                List.of(new Members("Chris Martin"),
                        new Members("Guy Berryman"),
                        new Members("Will Champion"),
                        new Members("Phil Harvey")), "London");

        List<Artists> artists = List.of(arianaGrande, beatles, coldplay);
        long countFromLiverpool = 0;

        for (Artists artist : artists) {
            if (artist.isFrom("Liverpool")) {
                countFromLiverpool++;
            }
        }

        System.out.println("countFromLiverpool = " + countFromLiverpool);

        long numberOfGroupsFromLiverpool = artists.stream()
                .filter(artists1 -> artists1.isFrom("Liverpool"))
                .filter(artists1 -> artists1.getMembersList().size() > 2)
                .count();

        System.out.println("numberOfGroupsFromLiverpool = " + numberOfGroupsFromLiverpool);


        String result = Stream.of("a", "b", "c")
                .filter(s -> s.equalsIgnoreCase("a"))
                .findFirst()
                .orElse(null);

        System.out.println("result = " + result);


        // gathering matched criteria to use maybe elsewhere:
        List<Artists> london = artists.stream()
                .filter(artists1 -> artists1.isFrom("London"))
                .collect(Collectors.toList());

        List<Members> collect = artists.stream()
                .map(Artists::getMembersList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);

        //sorting:
        Collections.sort(artists, new Comparator<Artists>() {
            @Override
            public int compare(Artists o1, Artists o2) {
                return 0;
            }
        });

        // better to do this:
        Set<Artists> uniqueArtists = new HashSet<>(artists);

        uniqueArtists.stream()
                .sorted(comparing(Artists::getName));

        Collections.sort(artists, comparing(Artists::getName));
    }
}