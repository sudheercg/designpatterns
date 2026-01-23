package codegnan.designpatterns.structural.adapter;

public class PaymentAdapter implements PaymentService {

    private final ExternalPaymentClient client;

    public PaymentAdapter(ExternalPaymentClient client) {
        this.client = client;
    }

    @Override
    public void pay(double amount) {
        client.makePayment(amount);
    }
}