package commanchesterdigital;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CodingChallenge2 {

    public static void main(String[] args) {
       int day = 2;
       int weekday = 1;

       if (weekday <=5 && weekday>=1 ) {
           System.out.println("day is a weekday");

           if (day == 2 || day == 4) {
               System.out.println("I go to the gym");
           }
       }

       if (day == 7){
           System.out.println("I do gardening");
       }



    }
}
