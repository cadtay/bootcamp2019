package commanchesterdigital;

public class UserService {

    private static User user;

    static {
        user = new User("Callum");
        user.setId(1L);
    }

    public User retriveUser(Long id) {

        if (!id.equals(user.getId())){
            throw new UserNotFoundException("User not found matching ID : " + id);
        }

        return user;
    }

    public static void main(String[] args) {
            UserService userService = new UserService();

        User retrivedUser = userService.retriveUser(1L);
        System.out.println(retrivedUser.toString());
    }
}
