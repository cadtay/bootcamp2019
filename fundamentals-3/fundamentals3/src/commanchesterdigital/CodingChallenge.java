package commanchesterdigital;

public class CodingChallenge {

    public static void main(String[] args) {
        double number1 = 20;
        double number2 = 80;
        double total = number1 + number2;
        double multiply = total * 25;
        double result  = multiply % 40;
        System.out.println(result);
        if (result <= 20) {
            System.out.println("Total was over the limit");
        }
    }
}
