package Main.Java.Org.Shubham.StructuralPatterns.FlyWeightPattern;

public class BulletType {
    private String color;
    BulletType(String color){
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
//        returh this.color;
    }

    public String getColor() {
        return color;
    }
}
