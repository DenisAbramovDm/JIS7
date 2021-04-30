package homework.exceptions;

public class UserValidationService {

    public static void validate(User user) throws UserValidationException{
        if (user.getFirstName().length() < 3 || user.getLastName().length() < 3 ||
                user.getFirstName().length() > 15 || user.getLastName().length() > 15 ||
        user.getAge() < 0 || user.getAge() > 120){
            throw new UserValidationException("User validation failed");
        } else System.out.println("User validation is successful");

    }
}
