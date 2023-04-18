package dev.test.payments;

public class PaypalProvider implements PaymentProvider{

    @Override
    public void makePayment(int amount) throws PayException {
        System.out.println("processing pay of : "+amount+" $ for Paypal");
    }
}
