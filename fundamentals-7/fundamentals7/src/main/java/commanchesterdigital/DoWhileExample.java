package commanchesterdigital;

public class DoWhileExample {

    public static void main(String[] args) {
        boolean isLying = false;
        int one = 1;
        int total = 1;
        do{
            System.out.println("Cant wait for today to finish");
        } while (isLying);

        do {
            one++;
            total++;
            System.out.println(total);
        } while (one < 7);




    }

}
