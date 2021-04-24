package homework.decisions;

public class User {
    private String login;
    private String password;
    private boolean isBlocked;
    private int attempts;

    public User(String login, String password){
        this.login = login;
        this.password = password;
        this.attempts = 3;
        this.isBlocked = false;
    }

    public void resetAttempts(){
        this.attempts = 3;
    }
    public void decreaseAttempts(){
        this.attempts --;
    }
    public void blockUser(){
        this.isBlocked = true;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
}
