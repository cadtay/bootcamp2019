package commanchesterdigital;

public class ExceptionExample {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        printArray(0, arr);
        printArray(1, arr);
        printArray(2, arr);

        //
        try {
            printArray(3, arr);
        }

        catch(ArrayIndexOutOfBoundsException ae){
            System.err.println("Element does not exist " + ae.getLocalizedMessage());
        }
    }

    private static void printArray(int index, int [] arr){

        System.out.println("Element " + index + " is " + arr[index]);

    }
}
