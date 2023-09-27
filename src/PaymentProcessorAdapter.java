package src;

public class PaymentProcessorAdapter implements FinancialTransaction {
    private PaymentProcessor paymentProcessor;

    public PaymentProcessorAdapter(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    @Override
    public void executeTransaction(double amount) {
        paymentProcessor.processPayment(amount);
    }
}
