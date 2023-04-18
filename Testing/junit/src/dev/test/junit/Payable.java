package dev.test.junit;

import dev.test.payments.PayException;
import dev.test.payments.PaymentProvider;

public interface Payable {
    void pay(PaymentProvider pays) throws PayException;
}
