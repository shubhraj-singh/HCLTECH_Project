import org.example.model.Customer;
import org.example.model.HomeLoan;
import org.example.model.LoanApplication;
import org.example.model.LoanStatus;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanServiceTest {

    @BeforeAll
    public static void setup() {
        System.out.println("Setting up LoanService tests...");
        Customer customer = new Customer(1, "John Doe", "asdfg@gmail.com", "1234567890", "CUST001", 750, 60000);
        HomeLoan loan = new HomeLoan("LOAN001", 250000, 5.5, 15, 1000000, 2000);
        LoanApplication application = new LoanApplication("APP001", customer, loan);
    }

    @Test
    void successfulLoanApplication() {
        Customer customer = new Customer(1, "John Doe", "asdfg@gmail.com", "1234567890", "CUST001", 750, 60000);
        HomeLoan loan = new HomeLoan("LOAN001", 250000, 5.5, 15, 1000000, 2000);
        LoanApplication application = new LoanApplication("APP001", customer, loan);
        customer.login();
        customer.applyLoan(loan);
        application.submitApplication();
        assertEquals(LoanStatus.APPLIED, loan.getLoanStatus());
    }

    @Test
    void laonrejectionduetoeligibility() {
        Customer customer = new Customer(1, "John Doe", "asdfg@gmail.com", "1234567890", "CUST001", 600, 30000);
        HomeLoan loan = new HomeLoan("LOAN001", 250000, 5.5, 15, 1000000, 2000);
        LoanApplication application = new LoanApplication("APP001", customer, loan);
        customer.login();
        customer.applyLoan(loan);
        application.submitApplication();
        application.updateStatus(LoanStatus.REJECTED);
        assertEquals(LoanStatus.REJECTED, loan.getLoanStatus());
    }

    @Test
    void EMIcalculation() {
        HomeLoan loan = new HomeLoan("LOAN001", 250000, 5.5, 15, 1000000, 2000);
        double expectedEMI = 114583.33; // Calculated using the formula
        assertEquals(expectedEMI, loan.calculateEMI(), 0.01);
    }

    @Test
    void invalidLoanAmount() {
        HomeLoan loan = new HomeLoan("LOAN001", -50000, 5.5, 15, 1000000, 2000);
        try {
            loan.validateEligibility(new Customer(1, "John Doe", "asdfg@gmail.com", "1234567890", "CUST001", 750, 60000));
        } catch (Exception e) {
            assertEquals("Loan amount must be greater than zero.", e.getMessage());
        }
    }

    @Test
    void invalidLoanTenure() {
        HomeLoan loan = new HomeLoan("LOAN001", 250000, 5.5, 0, 1000000, 2000);
        try {
            loan.validateEligibility(new Customer(1, "John Doe", "asd@gmail.com", "1234567890", "CUST001", 750, 60000));
        } catch (Exception e) {
            assertEquals("Loan tenure must be between 1 and 30 years.", e.getMessage());
        }
    }
}