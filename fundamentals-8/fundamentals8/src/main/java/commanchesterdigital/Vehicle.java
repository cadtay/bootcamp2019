package commanchesterdigital;

public class Vehicle {
    private final String colour;
    private final Integer numberOfSeats;
    private final TransmissionType transmissionType;
    private final Double enginSize;
    private final String manufacture;

    public Vehicle(String colour, Integer numberOfSeats, TransmissionType transmissionType, Double enginSize,
                   String manufacture) {
        this.colour = colour;
        this.numberOfSeats = numberOfSeats;
        this.transmissionType = transmissionType;
        this.enginSize = enginSize;
        this.manufacture = manufacture;
    }
}
