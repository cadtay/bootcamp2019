package commanchesterdigital;

public class Utility {


    public static boolean isEven(int a){
       /* if (a % 2 == 0){
            return true;
        }
        return false; */

       return a % 2 == 0;
    }

    public static boolean isNameEqual(String firstName, String lastName){

        return firstName.equalsIgnoreCase(lastName);
    }

    /**
     *
     * @param input the input received.
     * @return a long is successful
     * @throws NumberFormatException if input is not a number and outside a long's limit
     */
    public static Long convertStringToLong(String input) throws NumberFormatException{

        return new Long(input);
    }
}
