package org.shubh;

public abstract class User {

    private int userId;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public abstract void login();
    public abstract void logout();
}
