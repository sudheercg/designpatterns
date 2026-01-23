package codegnan.designpatterns.structural.adapter;

public class Demo {
	
	public static void main(String[] args) {
		PaymentService service = new  PaymentAdapter(new ExternalPaymentClient());
		service.pay(100);
	}

}
