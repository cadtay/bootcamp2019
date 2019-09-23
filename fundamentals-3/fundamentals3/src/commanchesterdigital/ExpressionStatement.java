package commanchesterdigital;

public class ExpressionStatement {

    public static void main(String[] args) {
        int numberOfGears = 4;
        double interestRate = 0.4d;

        double amountOfInterest = interestRate * numberOfGears;

        System.out.println("Interest is " + amountOfInterest);

        double radius = 12.0d;
        double outcome = Math.PI * radius * radius;

        int score  = 2000;

       if (score > 1000){
            System.out.println("Score is greater than 1000!");
        }
    }
}
