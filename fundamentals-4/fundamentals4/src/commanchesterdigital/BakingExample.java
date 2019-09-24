package commanchesterdigital;

public class BakingExample {

    public static void main(String[] args) {
        switchOvenOn(6);
    }

    protected static int switchOvenOn(int setting){
        int minutesToCook = 0;

        System.out.println("Setting oven to level " + setting);

        switch(setting){
            case 1:
                System.out.println("Setting to level 1");
                minutesToCook += 20;
                break;
            case 2:
                System.out.println("Setting to level 2");
                minutesToCook += 30;
                break;
            case 3:
                System.out.println("Setting to level 3");
                minutesToCook += 40;
                break;
            case 4:
                System.out.println("Setting to level 4");
                minutesToCook += 50;
                break;
            case 5:
                System.out.println("Setting to level 5");
                minutesToCook += 60;
                break;
            default:
                System.out.println("Oven is off");

        }

        return minutesToCook;
    }

    private static void produceMixture(){

        System.out.println("Mixing ....");
    }

    public void decorate (){
        System.out.println("Decorating cake....");
    }
}
