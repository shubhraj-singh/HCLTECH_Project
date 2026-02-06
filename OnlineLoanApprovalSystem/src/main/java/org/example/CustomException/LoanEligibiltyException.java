package org.example.CustomException;

public class LoanEligibiltyException extends RuntimeException {
    public LoanEligibiltyException(String message) {
        super(message);
    }
}
