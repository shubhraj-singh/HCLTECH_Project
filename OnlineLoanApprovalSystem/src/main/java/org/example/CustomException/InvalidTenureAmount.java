package org.example.CustomException;

public class InvalidTenureAmount extends RuntimeException {
    public InvalidTenureAmount(String message) {
        super(message);
    }
}
