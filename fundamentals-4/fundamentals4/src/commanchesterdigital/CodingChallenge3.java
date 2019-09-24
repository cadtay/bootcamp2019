package commanchesterdigital;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CodingChallenge3 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String computerSelection;
        Random rand = new Random();

        double comp = Math.random();

        if (comp <= 0.33) {
            computerSelection = "rock";
        } else if (comp <= 0.66) {
            computerSelection = "paper";
        } else {
            computerSelection = "scissor";
        }
        System.out.println(computerSelection);
        winner(input, computerSelection);
    }

    private static String winner(String userChoice, String compChoice) {
        String result = "";

        if (userChoice.equalsIgnoreCase(compChoice)) {
             result = "DRAW";
            System.out.println(result);
             return result;
        }
        else if (userChoice.equalsIgnoreCase("ROCK")
                && compChoice.equalsIgnoreCase("SCISSOR")) {
                result  = "USER WINS";
            System.out.println(result);
                return result;
        }

        else if (userChoice.equalsIgnoreCase("SCISSOR")
                && compChoice.equalsIgnoreCase("PAPER")){
             result = "USER WINS";
            System.out.println(result);
             return result;
        }

        else if (userChoice.equalsIgnoreCase("PAPER")
                && compChoice.equalsIgnoreCase("ROCK")){
            result = "USER WINS";
            System.out.println(result);
            return result;
        }

         result = "COMP WINS";
        System.out.println(result);
        return result;

    }
}
