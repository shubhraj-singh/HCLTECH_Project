package org.shubh;

public class PolicyHolder extends User{

    public PolicyHolder(int userId, String userName) {
        super(userId, userName);
    }
    @Override
    public void login() {
        System.out.println("PolicyHolder " + getUserName() + " logged in.");
    }

    @Override
    public void logout() {
        System.out.println("PolicyHolder " + getUserName() + " logged out.");
    }
}
