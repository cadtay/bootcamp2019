package commanchesterdigital;

public class Toyota extends Vehicle implements Movement {
    public Toyota(String colour, Integer numberOfSeats, TransmissionType transmissionType, Double enginSize, String manufacture) {
        super(colour, numberOfSeats, transmissionType, enginSize, manufacture);
    }

    @Override
    public void moveForwards() {
        System.out.println("Moving toyota forwards");
    }

    @Override
    public void reverse() {
        System.out.println("Reversing toyota");
    }
}
