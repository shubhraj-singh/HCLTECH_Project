package org.example.model;

public class HomeLoan extends Loan {

    private double propertyValue;
    private double maxLoanPercentage;

    public HomeLoan(String loanId, double loanAmount, double interestRate, int loanTenureYears, double propertyValue, double maxLoanPercentage) {
        super(loanId, loanAmount, interestRate, loanTenureYears);
        this.propertyValue = propertyValue;
        this.maxLoanPercentage = maxLoanPercentage;
    }

    @Override
    public double calculateEMI() {
        System.out.println("Calculating EMI for Home Loan.");
        double num = getLoanAmount() * (getInterestRate() / 12) * Math.pow(1 + (getInterestRate() / 12), getLoanTenureYears() * 12);
        double deno = Math.pow(1 + (getInterestRate() / 12), getLoanTenureYears() * 12) - 1;
        return num / deno;
        // Implement EMI calculation logic here
        //EMI standard formula: EMI = [P x R x (1+R)^N]/[(1+R)^N-1]
//        explain each variable in the formula:
//        P = Principal loan amount (the total amount of loan taken)
//        R = Monthly interest rate (annual interest rate divided by 12 and converted to decimal)
//        N = Loan tenure in months (number of years multiplied by 12)
    }

    @Override
    public boolean validateEligibility(Customer customer) {
        return getLoanAmount() <= (propertyValue * maxLoanPercentage);
    }
}
