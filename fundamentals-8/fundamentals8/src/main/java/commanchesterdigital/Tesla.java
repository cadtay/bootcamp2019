package commanchesterdigital;

public class Tesla extends Vehicle implements Movement, IsChargeable{
    public Tesla(String colour, Integer numberOfSeats, TransmissionType transmissionType, Double enginSize, String manufacture) {
        super(colour, numberOfSeats, transmissionType, enginSize, manufacture);
    }

    @Override
    public void moveForwards() {
        System.out.println("Moving forward tesla");
    }

    @Override
    public void reverse() {
        System.out.println("reversing faster");
    }

    @Override
    public void supercharge() {
        System.out.println("Supercharging");

    }
}
