package commanchesterdigital;

public class Operators {

    public static void main(String[] args) {
        // example of an operator
        int result = 1 + 2;
        System.out.println("Result is " + result);

        // subtract:
        result = 3 - 1;
        System.out.println("Result is " + result);

        // multiplication
        result = 5 * 9;
        System.out.println("Result is " + result);

        // division
        result = 10 / 5;
        System.out.println("Result is " + result);

        /*
        this says how many times can we remove 10 from 20
        the remainder is then assigned to result to which is 0
         */
        result = 20 % 10;
        System.out.println("Result is " + result);

        //increment:
        result = result = 1;

        //abbreviated increment
        result++;

        // post increment:
        result++;

        // pre-increment:
        ++result;

        //decrement:
        //remove 1 then re-assign outcome to result
        result = result -1;

        //post decrement
        result--;

        //pre-decrement:
        --result;

        //addition but in an abbrevaited way
        result += 1;

        // variation of result = result * or / or -
        result -= 10;

        result *= 20;

        result /=20;

        boolean isRainingToday = false;
        int number1 = 100;
        int number2 = 200;
        int degreeScore = 60;
        int overallScore = 100;

        if(number1 != number2){
            System.out.println("Not equal");
        }

        if(isRainingToday) {
            System.out.println("You won't need a jacket today!");
        }

        if(degreeScore >= 60 && overallScore >= 100){

        }

        if(degreeScore >= 60 || overallScore >= 100){

        }

        boolean isAnimal = false;

        //setting isAnimal to true
        if (isAnimal = true){
            System.out.println("Is animal");
        }

        String lastName = "Sousa";

        if(lastName.equalsIgnoreCase("Sousa")){
            System.out.println("Surename is sousa");
        }


        int numberOfMealsToday = 1;

        //example of a ternary operator:
        boolean isHungry = numberOfMealsToday == 1 ? true : false;


    }

}
