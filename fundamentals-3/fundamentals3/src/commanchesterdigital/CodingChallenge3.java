package commanchesterdigital;

import java.util.ArrayList;

public class CodingChallenge3 {

    public static void main(String[] args) {


        luckySum(4,5,13);
    }

    private static Integer luckySum(int a, int b, int c) {
        int total = 0;
        switch (a) {
            case 13:
                total = 0;
                System.out.println(total);
                return total;
            default:
                total = a + b + c;
                System.out.println(total);
                return total;
        }

    }
}
