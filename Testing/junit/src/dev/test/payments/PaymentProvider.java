package dev.test.payments;

public interface PaymentProvider {

    public void makePayment(int amount) throws PayException;
}
