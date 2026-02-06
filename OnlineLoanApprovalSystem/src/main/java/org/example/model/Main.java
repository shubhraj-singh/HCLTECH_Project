package org.example.model;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Customer customer = new Customer(1, "John Doe", "sdfer@gmail.com", "1234567890", "CUST001", 750, 60000);
            Loan loan = new HomeLoan("LOAN001", 250000, 5.5, 15, 1000000, 2000);
            LoanApplication application = new LoanApplication("APP001", customer, loan);

            customer.login();
            customer.applyLoan(loan);
            application.submitApplication();

            BankOfficer officer = new BankOfficer(2, "Jane Smith", "officer@gmail.com", "0987654321", "OFF001", "Main Branch", "Loan Officer");
            officer.login();
            officer.reviewLoan(application);

            application.updateStatus(LoanStatus.APPROVED);
            System.out.println(application.getApplicationSummary());

            officer.logout();
            customer.logout();
    }
}