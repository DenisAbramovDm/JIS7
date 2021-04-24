package homework.decisions;

public class UserLoginService {
    public boolean login(User user, String password){
        boolean result;
        if (user.isBlocked()) {  //проверка, заблокирован ли пользователь
            System.out.println("user is blocked");
            result = false;
        } else if(user.getPassword() == password){  //сверка паролей
            result = true;
            user.resetAttempts();
        } else {                                //если юзер не был заблочен, но пароли не совпали
            result = false;
            user.decreaseAttempts();
            System.out.printf("number of attempts left is %s", user.getAttempts());
            if (user.getAttempts() == 0){
                System.out.println("You have no attempts more. You are blocked");
                user.blockUser();
            }
        }
        return result;
    }
}
