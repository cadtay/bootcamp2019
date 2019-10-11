package com.manchsterdigital;

import java.lang.reflect.Member;
import java.util.List;

public class Artists {
    private final String name;
    private final List<Members> membersList;
    private final String location;
    private String song;
    private String album;

    public Artists(String name, List<Members> membersList, String location) {
        this.name = name;
        this.membersList = membersList;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public List<Members> getMembersList() {
        return membersList;
    }

    public String getLocation() {
        return location;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public boolean isFrom(String locationRequired){
        return location.equalsIgnoreCase(locationRequired);
    }

    @Override
    public String toString() {
        return "Artists{" +
                "name='" + name + '\'' +
                ", membersList=" + membersList +
                ", location='" + location + '\'' +
                ", song='" + song + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
