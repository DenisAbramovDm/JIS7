package homework.streamAPI.model;

import lombok.ToString;

@ToString
public class User {
    private static int userId = 0;
    private final String id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String password;
    private UserStatus status;
    private boolean isActive;

    public User(String firstName, String lastName, int age, String email, String password, UserStatus status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.status = status;
        this.id = createId();
        this.isActive = false;
    }

    private String createId() {
        return String.valueOf(userId++);
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserStatus getStatus() {
        return status;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
