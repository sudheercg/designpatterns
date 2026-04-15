package codegnan.designpatterns.structural.adapter;
public class ExternalPaymentClient {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount);
    }
}