package com.manchesterdigital;

import java.util.*;

public class Scratch {
    public static void main(String[] args) {
        Artist adele = new Artist("Adele", 9000000L);
        Artist prince = new Artist("Prince", 20000000L);

        List<Artist> artists = Arrays.asList(
                adele,
                prince
        );

        for (Artist artist : artists){
            System.out.println("artist = " + artist.toString());
        }

        Map<Long, Artist> artistMap = new HashMap<>();
        artistMap.put(1L, adele);
        artistMap.put(2L, prince);

        for(Map.Entry<Long, Artist> entry: artistMap.entrySet()){
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }

        // iterate over keys:

        for(Long key: artistMap.keySet()){
            System.out.println("key = " + key);
            if(artistMap.containsKey(key)){
                System.out.println("key = " + key + "exists");
            }
        }

        for(Artist artist : artistMap.values()){
            System.out.println("artist = " + artist);
        }

        //Sets
        Set<Artist> artistSet = new HashSet<>(artistMap.values());

        // iterate over unique values from artists:
        for (Artist artist: artistSet){
            System.out.println("unique artist = " + artist);
        }

        // Immutability
        List<Integer> numbers = List.of(1, 2, 3, 5);

        for(Integer i : numbers){
            System.out.println("i = " + i);
        }

        Set<Long> distances = Set.of(1L, 2L, 3L, 4L);

        for(Long distance : distances){
            System.out.println("l = " + distances);
        }

        Map<Long, String> namesMap =
                Map.of(1L, "John", 2L, "April");

        for (Map.Entry<Long, String> nameEntry : namesMap.entrySet()){
            System.out.println("nameEntry = " + nameEntry.getValue());
        }

        List<Artist> allArtists = List.of(adele, prince);

        for(Artist artist : allArtists){
            System.out.println("artists = " + artists);
        }

        allArtists.forEach(artist -> System.out.println("artist = " + artist));

        allArtists.forEach(System.out::println);
    }
}
