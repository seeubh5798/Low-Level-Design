package Main.Java.Org.Shubham.BehaviourPatterns.StrategyPattern;

public class StrategyDriver {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CreditCard());
        paymentService.pay(1000);

        paymentService.setPaymentStrategy(new DebitCard());
        paymentService.pay(3000);
    }
}
