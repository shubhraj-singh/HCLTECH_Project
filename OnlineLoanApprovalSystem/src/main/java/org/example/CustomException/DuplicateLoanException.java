package org.example.CustomException;

public class DuplicateLoanException extends RuntimeException {
    public DuplicateLoanException(String message) {
        super(message);
    }
}
