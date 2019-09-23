package commanchesterdigital;

public class SwitchStatements {

    public static final int TEN_PENCE = 10;

    public static void main(String[] args) {
        int coinInserted = 50;

        switch (coinInserted){
            case TEN_PENCE:
            case 20:
              warningMessage();
                break;
            case 50:
                System.out.println("Inserted 50p");
                break;
            default:
                System.out.println("No coin detected");
        }

        System.out.println("Change given");
    }

    private static void warningMessage(){
        System.out.println("To little change inserted");

    }

}
