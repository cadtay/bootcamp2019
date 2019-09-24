package commanchesterdigital;

public class CodingChallenge2 {

    public static void main(String[] args) {
        registrationGenerator("ya15 3ff");
    }

    private static String registrationGenerator (String input){
        String s = "5";
        String a = "4";
        String i = "1";
        String b = "8";
        String g = "9";



        if (input.contains("s")){
            input.replace('s', '5');
        }
        if (input.contains("a")){
            input.replace('a', '4');

        }
        if (input.contains("i")){
            input.replace('i', '1');

        }
        if (input.contains("b")){
            input.replace('b', '8');

        }
        if (input.contains("g")){
            input.replace('g', '9');

        }

        System.out.println(input);
        return input;

    }
}
