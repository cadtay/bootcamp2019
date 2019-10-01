package commanchesterdigital;

public class WhileExample {

    public static void main(String[] args) {
        /**
         * while (boolean expression) {
         *      // Logic for loop
         * }
         */

        double growthRate = 0.04; // 4 percent
        int population = 800;
        int year = 0;
        int start = 1;
        int total = 0;
        int counter = 0;

        while (population <= 1200){
            Double tempPopulation = population * (1 + growthRate);
            population = tempPopulation.intValue();
            year++;
        }
        System.out.println("year = " + year);

        while (start < 100){
           start++;
           counter++;
           total = start + start;

        }
        System.out.println(total);
        System.out.println(total/counter);


    }

}
