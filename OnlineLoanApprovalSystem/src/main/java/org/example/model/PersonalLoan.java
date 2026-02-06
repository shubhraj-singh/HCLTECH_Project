package org.example.model;

public class PersonalLoan extends Loan {
    private double monthlyIncome;

    public PersonalLoan(String loanId, double loanAmount, double interestRate, int loanTenureYears, double monthlyIncome) {
        super(loanId, loanAmount, interestRate, loanTenureYears);
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public double calculateEMI() {
        System.out.println("Calculating EMI for Personal Loan.");
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
        return calculateEMI() <= 0.4 * monthlyIncome;
    }
}
