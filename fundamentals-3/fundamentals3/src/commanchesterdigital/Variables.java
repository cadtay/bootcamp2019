package commanchesterdigital;

public class Variables {
    static int counter = 0;
    static boolean isHungry = false; //Instance variable

    public static void main(String[] args) {
        greetWhenAdult(20);
    }


    private static void greetWhenAdult(int age){
        // Local variable only can be used within this method
        boolean isHappy = true;
            if (!isHungry){
        if(isHappy && age >= 18) {
            System.out.println("Hello");
        }
        }
    }
}
