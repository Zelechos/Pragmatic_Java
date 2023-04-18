package dev.test.payments;

public class WithoutFundToPay implements PaymentProvider{
    @Override
    public void makePayment(int amount) throws PayException {
        throw new PayException("the user don't have funds to pay");
    }
}
