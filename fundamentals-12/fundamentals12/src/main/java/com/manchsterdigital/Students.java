package com.manchsterdigital;

import java.util.List;

public class Students {
    private final String studentLanguages;
    private final Integer Score;
    private final String name;

    public Students(String studentLanguages, Integer score, String name) {
        this.studentLanguages = studentLanguages;
        this.Score = score;
        this.name = name;
    }

    public Integer score (int s){
        return score(s);
    }

    public String getStudentLanguages() {
        return studentLanguages;
    }

    public Integer getScore() {
        return Score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentLanguages='" + studentLanguages + '\'' +
                ", Score=" + Score +
                ", name='" + name + '\'' +
                '}';
    }
}
