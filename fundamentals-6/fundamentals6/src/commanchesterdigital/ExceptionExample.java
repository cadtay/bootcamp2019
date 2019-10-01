package commanchesterdigital;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample {

    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("Z://myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
