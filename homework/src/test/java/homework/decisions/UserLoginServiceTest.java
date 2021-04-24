package homework.decisions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserLoginServiceTest {

    @Test
    void login() {
        String validPassword = "user-password";
        String wrongPassword = "wrong-password";
        User user = new User("user-login", validPassword);
        UserLoginService service = new UserLoginService();
        assertEquals(true, service.login(user, validPassword));
        assertEquals(false, service.login(user, wrongPassword));
    }
}