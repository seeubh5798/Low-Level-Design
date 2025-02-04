package Main.Java.Org.Shubham.StructuralPatterns.FlyWeightPattern;

public class Bullet {
    private int velocity;
    private int x;
    private  int y;
    private BulletType type;

    Bullet(int velocity, int x , int y, String color){
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.type = BulletFactory.getBullettype(color);
    }

    void print(){
        System.out.println(this.x + " has color = "+ this.type.getColor());
    }



}
