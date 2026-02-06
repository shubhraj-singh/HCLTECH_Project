package org.example.model;

import java.time.LocalDate;

public class LoanApplication {
    private String applicationId;
    private Customer customer;
    private Loan loan;
    private LocalDate applicationDate;

    public LoanApplication(String applicationId, Customer customer, Loan loan) {
        this.applicationId = applicationId;
        this.customer = customer;
        this.loan = loan;
        this.applicationDate = LocalDate.now();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Loan getLoan() {
        return loan;
    }

    public void submitApplication(){
        System.out.println("Submitting loan application for customer: " + customer.getCustomerId());
        loan.setLoanStatus(LoanStatus.APPLIED);
    }

    public void updateStatus(LoanStatus status) {
        System.out.println("Updating loan application status to: " + status);
        loan.setLoanStatus(status);
    }

    public String getApplicationSummary() {
        return "Application ID: " + applicationId + "\n" +
                "Customer ID: " + customer + "\n" +
                "Loan Details: " + loan.getLoanDetails() + "\n" +
                "Application Date: " + applicationDate + "\n" +
                "Current Status: " + loan.getLoanStatus();
    }
}
