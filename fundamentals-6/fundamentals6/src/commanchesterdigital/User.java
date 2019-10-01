package commanchesterdigital;

public class User {
    private long id;
    private String firstName;

    public User(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "firstName = " + firstName;
    }
}
