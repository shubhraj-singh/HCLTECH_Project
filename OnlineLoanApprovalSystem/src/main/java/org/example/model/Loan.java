package org.example.model;

public abstract class Loan {
    private String loanId;
    private double loanAmount;
    private double interestRate;
    private int loanTenureYears;
    private LoanStatus loanStatus;

    public Loan(String loanId, double loanAmount, double interestRate, int loanTenureYears) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTenureYears = loanTenureYears;
        this.loanStatus = LoanStatus.APPLIED; // Default status when a loan is created
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getLoanTenureYears() {
        return loanTenureYears;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }

    public abstract double calculateEMI();
    public abstract boolean validateEligibility(Customer customer);


    public String getLoanDetails() {
        return "Loan ID: " + loanId + "\n" +
                "Loan Amount: " + loanAmount + "\n" +
                "Interest Rate: " + interestRate + "%\n" +
                "Loan Tenure: " + loanTenureYears + " years\n" +
                "Loan Status : " + loanStatus;
    }

}
