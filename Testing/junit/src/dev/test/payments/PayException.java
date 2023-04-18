package dev.test.payments;

public class PayException extends Exception {

    private final String message;

    public PayException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
