package homework.decisions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void resetAttempts() {
        User user = new User("user-login", "user-password");
        user.setAttempts(1);
        int resetedAttempts = 3;
        user.resetAttempts();
        assertEquals(resetedAttempts, user.getAttempts());
    }

    @Test
    void decreaseAttempts() {
        User user = new User("user-login", "user-password");
        user.decreaseAttempts();
        int decreasedAttempts = 2;
        assertEquals(decreasedAttempts, user.getAttempts());
    }

    @Test
    void blockUser() {
        User user = new User("user-login", "user-password");
        user.blockUser();
        assertEquals(true, user.isBlocked());

    }
}