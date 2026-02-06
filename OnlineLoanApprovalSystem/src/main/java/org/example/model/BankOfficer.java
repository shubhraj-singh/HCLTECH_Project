package org.example.model;

public class BankOfficer extends User {

    private String officerId;
    private String branchName;
    private String designation;

    public BankOfficer(int userId, String userName, String email, String mobileNumber, String officerId, String branchName, String designation) {
        super(userId, userName, email, mobileNumber);
        this.officerId = officerId;
        this.branchName = branchName;
        this.designation = designation;
    }

    @Override
    public void login() {
        System.out.println("Bank Officer logged in successfully.");
    }

    @Override
    public void logout() {
        System.out.println("Bank Officer logged out successfully.");
    }

    public void reviewLoan(LoanApplication application){
        System.out.println("Reviewing loan application for customer.");
        // Implement loan review logic here
    }
}
