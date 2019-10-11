package com.manchsterdigital;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentChallenge {

    public static void main(String[] args) {


        Students student = new Students("German", 60, "john");
        Students student1 = new Students("French", 40, "Andy");
        Students student2 = new Students("English", 80, "Sam");

        List<Students> students = List.of(student1, student2, student);

        List<Students> filtered = students.stream()
                .filter(students1 -> students1.getScore() > 50)
                .filter(students1 -> students1.getName().startsWith("S"))
                .filter(students1 -> students1.getStudentLanguages().equalsIgnoreCase("English"))
                .collect(Collectors.toList());

        System.out.println("students = " + filtered);
    }


    private static List<Students> extractStudents(List<Students> students, String subject, Integer minscore) {
        return students.stream()
                .filter(studentFilter(subject, minscore))
                .collect(Collectors.toList());
    }

    private static Predicate<Students> studentFilter(String subject, Integer minScore) {
        return students -> students.getStudentLanguages().equalsIgnoreCase(subject) &&
                students.getScore() > minScore &&
                (students.getName().startsWith("A") || students.getName().startsWith("S"));
    }
}

