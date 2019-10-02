package commanchesterdigital;

public class Teacher extends Person {

    public Teacher(String firstName, String lastName, Integer age, Address address) {
        super(firstName, lastName, age, address);
    }

    @Override
    public void haveLunch() {
        System.out.println("Having lunch at 13:00");
    }
}
