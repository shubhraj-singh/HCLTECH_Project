package org.example.model;

public abstract class User {
    private int userId;
    private String userName;
    private String email;
    private String mobileNumber;

    public User(int userId, String userName, String email, String mobileNumber) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public abstract void login();
    public abstract void logout();

    public String getUserDetails() {
        return "User ID: " + userId + "\n" +
                "User Name: " + userName + "\n" +
                "Email: " + email + "\n" +
                "Mobile Number: " + mobileNumber;
    }
}
