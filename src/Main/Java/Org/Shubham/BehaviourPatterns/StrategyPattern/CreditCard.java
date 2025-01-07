package Main.Java.Org.Shubham.BehaviourPatterns.StrategyPattern;

public class CreditCard implements PaymentStrategy{
    /**
     * @param number
     */
    @Override
    public void pay(float number) {
        System.out.println("Paying via Credit card and amount is: " + number);
    }
}
