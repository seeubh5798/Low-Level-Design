package Main.Java.Org.Shubham.BehaviourPatterns.StrategyPattern;

public class PaymentService {

    private PaymentStrategy paymentStrategy ;
//
//    PaymentService(PaymentStrategy paymentStrategy){
//        this.paymentStrategy = paymentStrategy;
//    }

    void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    void  pay (float number){
        paymentStrategy.pay(number);
    }
}
