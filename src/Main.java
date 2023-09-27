package src;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        creditCardProcessor.processPayment(100.0);

        FinancialTransaction adapter = new PaymentProcessorAdapter(creditCardProcessor);
        adapter.executeTransaction(200.0);
    }
}
