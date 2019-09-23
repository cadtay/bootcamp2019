package commanchesterdigital;

import static commanchesterdigital.Students.CLASS_NAME;

public class School {

    public static void main(String[] args) {
        Students april = new Students("April");
        april.printDetails();

        System.out.println(CLASS_NAME);
    }
}
