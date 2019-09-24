package commanchesterdigital;

public class ImprovedCarDealership {

    public static void main(String[] args) {
        boolean taxYearEnded  = true;
        int baseSalary = 20000;
        int numberOfSales = 1000;
        double commissionRate = 3.0;
        int bonus = 1000;

         calculateSalary(taxYearEnded, numberOfSales, baseSalary, commissionRate);

    }

    private static void calculateSalary (boolean taxYearEnded,
                                         int numberOfSales,
                                         int baseSalary,
                                         double commissionRate) {

        if(taxYearEnded){
            int bonus = 1000;
            double totalSalary = 0;

            if(numberOfSales > 500){
                totalSalary = baseSalary + (numberOfSales * commissionRate);
                totalSalary += bonus;
            }
            System.out.println("Total salary is " + totalSalary);
        }
    }
}
