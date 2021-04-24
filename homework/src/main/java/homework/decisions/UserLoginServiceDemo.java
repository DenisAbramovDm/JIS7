package homework.decisions;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");
        System.out.println(service.login(userOne, "user-password-12345"));
        System.out.println(service.login(userOne, "user-password-12345"));
        System.out.println(service.login(userOne, "user-password-12345"));
        System.out.println(service.login(userOne, "user-password-12345"));
    }
}
