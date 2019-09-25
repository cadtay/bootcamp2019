package commanchesterdigital;

import java.io.FileInputStream;

public class Runner {

    public static void main(String[] args) {

       boolean result = Utility.isEven(2);
        System.out.println("Result " + result);

        boolean isNameEqual =  Utility.isNameEqual("First", "First");
        System.out.println("Result " + isNameEqual);

        Dog rottweiler = new Dog(100);
        System.out.println(rottweiler.bark());

        Dog.relieve();
        System.out.println(Dog.NUMBER_OF_TEETH);

        Long id;

        try {
            id = Utility.convertStringToLong("687764");
            System.out.println(id);
        }
        //FileInputStream is = new FileInputStream();
        catch (NumberFormatException e){
            e.printStackTrace();
            System.err.println("Input provided was not a valid number " + e);
            //don't do
            System.err.println(e);

            id = Long.MAX_VALUE;
        }

        finally {
            //is.close;

        }
        System.out.println("My ID is " + id);

        // don't do:
        try {
            Long num = Utility.convertStringToLong("123");
        }
        catch (Throwable e){
            // don't do this empty catch
        }

        //don't do this also
        try {
            Long num2 = Utility.convertStringToLong("23");
        }

        catch (NumberFormatException e){
            // don't do this
            System.err.println(e);
            throw e;
        }
    }
}
