package org.example.service;

import org.example.CustomException.InvalidLoanAmountException;
import org.example.model.Loan;
import org.example.model.LoanApplication;

public class LoanService {

    public void validateLoan(Loan loan) throws InvalidLoanAmountException {
        try{
            if (loan.getLoanAmount() <= 0) {
                throw new InvalidLoanAmountException("Loan amount must be greater than zero.");
            }

            if(loan.getLoanTenureYears() < 1 || loan.getLoanTenureYears() > 30){
                throw new InvalidLoanAmountException("Loan tenure must be between 1 and 30 years.");
            }

        } catch (InvalidLoanAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double processLoan(LoanApplication application) {
        validateLoan(application.getLoan());
        if (application.getLoan().validateEligibility(application.getCustomer())) {
            double emi = application.getLoan().calculateEMI();
            System.out.println("Loan approved. EMI: " + emi);
            return emi;
        } else {
            System.out.println("Loan application rejected due to eligibility criteria.");
            return 0;
        }
    }
}
