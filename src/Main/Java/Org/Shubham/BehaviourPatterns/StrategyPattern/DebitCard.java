package Main.Java.Org.Shubham.BehaviourPatterns.StrategyPattern;

public class DebitCard implements PaymentStrategy{

    @Override
    public void pay(float number) {
        System.out.println("Paying via Debit card and amount is: " + number);
    }
}
