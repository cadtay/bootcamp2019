package commanchesterdigital;

public class MethodOverloading {

public int multiply (int a, int b){

    return a * b;

}

public int multiply (int first, int second, int third){
    return first * second * third;
}

    public int multiply (int first, int second, int third, int four){
        return first * second * third * four;
    }

    public static void main(String[] args) {
    //object of type me of class MethodOverloading
        MethodOverloading me = new MethodOverloading();

        int result = me.multiply(3,4);
        System.out.println("Result: " + result);

        result = me.multiply(3,5,6);
        System.out.println("Result: " + result);

        result = me.multiply(3,5,6,8);
        System.out.println("Result: " + result);
;    }
}
