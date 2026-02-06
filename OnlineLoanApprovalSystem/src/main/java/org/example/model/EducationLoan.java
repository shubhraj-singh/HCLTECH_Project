package org.example.model;

public class EducationLoan extends Loan {
    private String courseName;
    private String universityName;
    private int courseDurationYears;
    private double guardianIncome;

    public EducationLoan(String loanId, double loanAmount, double interestRate, int loanTenureYears,
                         String courseName, String universityName, int courseDurationYears, double guardianIncome) {
        super(loanId, loanAmount, interestRate, loanTenureYears);
        this.courseName = courseName;
        this.universityName = universityName;
        this.courseDurationYears = courseDurationYears;
        this.guardianIncome = guardianIncome;
    }

    @Override
    public double calculateEMI() {
        System.out.println("Calculating EMI for Education Loan.");
        double num = getLoanAmount() * (getInterestRate() / 12) * Math.pow(1 + (getInterestRate() / 12), getLoanTenureYears() * 12);
        double deno = Math.pow(1 + (getInterestRate() / 12), getLoanTenureYears() * 12) - 1;
        return num / deno;
    }

    @Override
    public boolean validateEligibility(Customer customer) {
        return guardianIncome >= 30_00_000 && courseDurationYears > 1;
    }
}
