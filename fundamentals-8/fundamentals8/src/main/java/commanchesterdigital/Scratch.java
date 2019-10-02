package commanchesterdigital;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scratch {

    public static final String RED_COLOUR = "RED";

    public static void main(String[] args) {

        System.out.println(RainbowColours.BLUE.toString());

        OrderProcessor orderProcessor = new OrderProcessor(OrderStatus.AWAITING_PAYMENT);

        orderProcessor.printOrderMessage();

        Dog poodle = new Dog(DogSize.SMALL);
        poodle.setHungerLevel(100);

        poodle.hungry();

        Dog labrador = new Dog(DogSize.LARGE);
        labrador.bark();

        Address address = new Address("1st Street", "Manchester", "M23 6HO");
        //Person person = new Person("Jill", "Jones", 34, address);

        //person.printAddress();

        NavigatorNew navigatorNew = new NavigatorNew(3,2,4,5);
            navigatorNew.forward();
            navigatorNew.backward();
            navigatorNew.left();
            navigatorNew.right();

       // System.out.println(person.toString());

        Student studnent = new Student("Jack", "Smith", 32, address);
        studnent.setUniversityName("Man Met");
        System.out.println(studnent.toString());

        Person anotherStudent = new Student("Sania", "NoIdea", 32, address);


        Lights lights = new Lights();
        Fan pelonisFan = new Fan();

        List<Controls> controls = Arrays.asList(lights, pelonisFan);

        controls.add(lights);
        controls.add(pelonisFan);

        for(Controls controllableItem : controls){
            controllableItem.switchOn();
            controllableItem.switchOff();


        }
    }
}
