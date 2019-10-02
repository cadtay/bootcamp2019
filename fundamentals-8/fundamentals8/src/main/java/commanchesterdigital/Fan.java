package commanchesterdigital;

public class Fan implements Controls {
    @Override
    public void switchOn() {
        System.out.println("Fan on");
    }

    @Override
    public void switchOff() {
        System.out.println("Fan off");
    }
}
