package commanchesterdigital;

public class InterestCalculator {

    public static void main(String[] args) {
        double amount = 100.0d;
        int counter = 0;
        String str = "Hi";

        for (int i = 10; i <= 50 ; i+=10) {
            System.out.println(calculateInterest(amount, i));
        }

        for (int i = 0; i <= 500; i++){
            if (i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
                counter+=i;
            }
        }
        System.out.println(counter);

        stringNumOfTimes("Hi", 2);
    }

    private static double calculateInterest(double amount, int i) {
        return (amount * i) / 100;
    }

    private static String stringNumOfTimes (String str, int numOfTimes){

        for (int i = 0;  i <= numOfTimes; i++){
            System.out.print(i);

        }

        return str;
    }

}
