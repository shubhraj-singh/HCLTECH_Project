package org.example.model;

public class Customer extends User {

    private String customerId;
    private int creditScore;
    private double annualIncome;

    public Customer(int userId, String userName, String email, String mobileNumber, String customerId, int creditScore, double annualIncome) {
        super(userId, userName, email, mobileNumber);
        this.customerId = customerId;
        this.creditScore = creditScore;
        this.annualIncome = annualIncome;
    }

    @Override
    public void login(){
        System.out.println("Customer logged in successfully.");
    }

    @Override
    public void logout() {
        System.out.println("Customer logged out successfully.");
    }

    public String getCustomerId() {
        return customerId;
    }

    public void applyLoan(Loan loan) {
        System.out.println("Applying for loan: " + loan.getLoanDetails());
    }

    @Override
    public String toString() {
        return customerId;
    }
}
