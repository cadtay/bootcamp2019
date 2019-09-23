package commanchesterdigital;

public class Scratch {

    public static void main(String[] args) {
        boolean isMorning = true;


        if (isMorning){
            System.out.println("It's morning");
            putTheKettleOn();
        }

        //assignment statement
        int numberOfTeams = 9;

        //declarative statement
        double interestRate = 0.5;

        //method invocation statement
        System.out.println("Hello World");

        // object creation statement
        car nissan = new car();
    }

    private static void putTheKettleOn(){
        System.out.println("Putting the kettle on...");
    }

}

