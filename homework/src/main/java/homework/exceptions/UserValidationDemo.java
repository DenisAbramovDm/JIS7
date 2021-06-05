package homework.exceptions;

import static homework.exceptions.UserValidationService.validate;

public class UserValidationDemo {
    public static void main(String[] args) {
        User user = new User("Denis", "Abramov", 121);
        validate(user);
    }
}
