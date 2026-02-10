package org.shubh;

public class InsuranceOfficer extends User {

    public InsuranceOfficer(int userId, String userName) {
        super(userId, userName);
    }

    @Override
    public void login() {
        System.out.println("Insurance Officer " + getUserName() + " logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Insurance Officer " + getUserName() + " logged out.");
    }
}
