package commanchesterdigital;

import java.util.ArrayList;

public class ForEachExample {

    public static void main(String[] args) {
        /**
         * for (data type instance: collection)
         * some logic
         */
        ArrayList <String> students = new ArrayList<>();
        students.add("Callum");
        students.add("Andrew");
        students.add("Trump");

        for (String student : students){
            System.out.println("student = " + student);
        }

        }

    private static boolean only1Or4 (ArrayList<Integer> numbers){
        boolean result = true;

        for(Integer number: numbers){
            if(!number.equals(1) || !number.equals(4)){
                result  = false;
                break;
            }
        }

        return result;

    }
    }


