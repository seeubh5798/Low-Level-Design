package Main.Java.Org.Shubham.StructuralPatterns.FacadePattern;

public class APIGateway {

    OrderMicroservice oms;
    UserMicroservice ums;

    APIGateway(){
        this.oms = new OrderMicroservice();
        this.ums = new UserMicroservice();
    }

    void getAlldetails(String orderId, String name){
        this.oms.getOrderDetails(orderId);
        this.ums.getUserDetails(name);
    }
}
